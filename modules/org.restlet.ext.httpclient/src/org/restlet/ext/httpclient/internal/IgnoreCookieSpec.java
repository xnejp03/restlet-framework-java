/**
 * Copyright 2005-2014 Restlet
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: Apache 2.0 or or EPL 1.0 (the "Licenses"). You can
 * select the license that you prefer but you may not use this file except in
 * compliance with one of these Licenses.
 * 
 * You can obtain a copy of the Apache 2.0 license at
 * http://www.opensource.org/licenses/apache-2.0
 * 
 * You can obtain a copy of the EPL 1.0 license at
 * http://www.opensource.org/licenses/eclipse-1.0
 * 
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 * 
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * http://restlet.com/products/restlet-framework
 * 
 * Restlet is a registered trademark of Restlet S.A.S.
 */

package org.restlet.ext.httpclient.internal;

import java.util.Collections;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.impl.cookie.CookieSpecBase;

/**
 * Cookie specifications that ignore all cookies.
 * 
 * @author Jerome Louvel
 * @deprecated Will be removed to favor lower-level network extensions allowing
 *             more control at the Restlet API level.
 */
@Deprecated
public class IgnoreCookieSpec extends CookieSpecBase {

    /**
     * Returns an empty list.
     * 
     * @return An empty list.
     */
    public List<Header> formatCookies(List<Cookie> cookies) {
        return Collections.emptyList();
    }

    /**
     * Returns '0' as version.
     * 
     * @return '0' as version.
     */
    public int getVersion() {
        return 0;
    }

    /**
     * Returns a null version header.
     * 
     * @return A null version header.
     */
    public Header getVersionHeader() {
        return null;
    }

    /**
     * Returns an empty list.
     * 
     * @return An empty list.
     */
    public List<Cookie> parse(Header header, CookieOrigin origin)
            throws MalformedCookieException {
        return Collections.emptyList();
    }

}
