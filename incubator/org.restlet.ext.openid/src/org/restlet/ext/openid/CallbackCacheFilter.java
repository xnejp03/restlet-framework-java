/**
 * Copyright 2005-2010 Noelios Technologies.
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: LGPL 3.0 or LGPL 2.1 or CDDL 1.0 or EPL 1.0 (the
 * "Licenses"). You can select the license that you prefer but you may not use
 * this file except in compliance with one of these Licenses.
 * 
 * You can obtain a copy of the LGPL 3.0 license at
 * http://www.opensource.org/licenses/lgpl-3.0.html
 * 
 * You can obtain a copy of the LGPL 2.1 license at
 * http://www.opensource.org/licenses/lgpl-2.1.php
 * 
 * You can obtain a copy of the CDDL 1.0 license at
 * http://www.opensource.org/licenses/cddl1.php
 * 
 * You can obtain a copy of the EPL 1.0 license at
 * http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 * 
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * http://www.noelios.com/products/restlet-engine
 * 
 * Restlet is a registered trademark of Noelios Technologies.
 */

package org.restlet.ext.openid;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

import org.json.JSONException;
import org.json.JSONObject;
import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Cookie;
import org.restlet.data.CookieSetting;
import org.restlet.data.Method;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.routing.Filter;
import org.restlet.routing.Redirector;

/**
 * Used for lookup of cached identity resolution.
 * 
 * @author Kristoffer Gronowski
 */
public class CallbackCacheFilter extends Filter implements CacheLookup {
    public static final String UserCookieID = "_uid";

    public static final String INTERNAL_SERVER_COOKIE = "auth-callback";

    public static final String EXTERNAL_SERVER_COOKIE = "callback";

    private SecureRandom random;

    private ConcurrentHashMap<String, String> userCache;

    public CallbackCacheFilter(Context context) {
        super(context);
        userCache = new ConcurrentHashMap<String, String>();
        try {
            random = SecureRandom.getInstance("SHA1PRNG");

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    // Cache result
    @Override
    protected void afterHandle(Request request, Response response) {
        Cookie c = request.getCookies().getFirst(UserCookieID);
        if (c != null) {
            Representation r = response.getEntity();
            if (r != null && (r instanceof JsonRepresentation)) {
                JsonRepresentation jr = (JsonRepresentation) r;
                try {
                    JSONObject o = jr.getJsonObject();
                    if (o != null && o.has("id")) {
                        String id = o.getString("id");
                        getLogger().info("Caching JSON id = " + id);

                        userCache.put(c.getValue(), id);
                        createResponse(id, request, response);
                        clearCookies(response);
                    }
                } catch (JSONException ignore) {
                }
            }
        }
    }

    @Override
    protected int doHandle(Request request, Response response) {
        Cookie c = request.getCookies().getFirst(UserCookieID);
        if (c == null) {
            String key = generate(40);
            CookieSetting cs = new CookieSetting(UserCookieID, key);
            response.getCookieSettings().add(cs);
            userCache.put(key, "");
        }
        return super.doHandle(request, response);
    }

    public boolean handleCached(Request request, Response response) {
        Cookie c = request.getCookies().getFirst(UserCookieID);
        if (c != null) { // might be in cache
            String key = c.getValue();
            if (key != null && key.length() > 0 && userCache.containsKey(key)) {
                createResponse(userCache.get(key), request, response);
                clearCookies(response);
                return true;
            }
        }
        return false;
    }

    private void createResponse(String id, Request request, Response response) {

        // Check response cookies, might be the firs time
        String callback = response.getCookieSettings().getFirstValue(
                INTERNAL_SERVER_COOKIE);
        // Also check the request if the cookie was set way back. TODO might
        // remove...
        if (callback == null)
            callback = request.getCookies().getFirstValue(
                    INTERNAL_SERVER_COOKIE);
        if (callback != null) {
            Redirector dispatcher = new Redirector(getContext(), callback,
                    Redirector.MODE_CLIENT_TEMPORARY);

            // //TODO maybe move it to use Principal.
            getContext().getAttributes().put("id", id); // same app
            dispatcher.handle(request, response);
            response.getCookieSettings().remove(INTERNAL_SERVER_COOKIE);
        } else {
            JSONObject obj = new JSONObject();
            try {
                obj.put("id", id);
                // for(String s : axRequired.keySet()) {
                // obj.put(s, axRequired.get(s));
                // }
                // for(String s : axOptional.keySet()) {
                // obj.put(s, axOptional.get(s));
                // }
            } catch (JSONException e) {
                getLogger().log(Level.WARNING, "Failed to get the ID!", e);
            }

            String jcallback = response.getCookieSettings().getFirstValue(
                    EXTERNAL_SERVER_COOKIE);
            if (jcallback == null)
                jcallback = request.getCookies().getFirstValue(
                        EXTERNAL_SERVER_COOKIE);
            if (jcallback != null) {
                Redirector dispatcher = new Redirector(getContext(), jcallback,
                        Redirector.MODE_SERVER_OUTBOUND);
                request.setEntity(new JsonRepresentation(obj));
                request.setMethod(Method.POST);
                dispatcher.handle(request, response);
                response.getCookieSettings().remove(EXTERNAL_SERVER_COOKIE);

            } else {
                response.setEntity(new JsonRepresentation(obj));
            }
        }
    }

    private String generate(int len) {
        // if( count++ > tokens ) {
        // count = 0;
        // random.setSeed(random.generateSeed(20));
        // }
        byte[] token = new byte[len];
        random.nextBytes(token);
        return toHex(token);
    }

    private String toHex(byte[] input) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < input.length; i++) {
            String d = Integer
                    .toHexString(new Byte(input[i]).intValue() & 0xFF);
            if (d.length() == 1)
                sb.append('0');
            sb.append(d);
        }
        return sb.toString();
    }

    private void clearCookies(Response response) {
        // Remove if someone before has set them
        response.getCookieSettings().removeAll("callback");
        response.getCookieSettings().removeAll("auth-callback");

        // Set a cookie that expires right away
        CookieSetting clear = new CookieSetting("callback", "");
        clear.setMaxAge(0);
        response.getCookieSettings().add(clear);
        CookieSetting clear2 = new CookieSetting("auth-callback", "");
        clear2.setMaxAge(0);
        response.getCookieSettings().add(clear2);

    }

}
