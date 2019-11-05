/**
 * Copyright 2005-2019 Restlet
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

package org.restlet.test.ext.odata.deepexpand.model;

/**
 * Generated by the generator tool for the OData extension for the Restlet
 * framework.<br>
 * 
 * @see <a
 *      href="http://praktiki.metal.ntua.gr/CoopOData/CoopOData.svc/$metadata">Metadata
 *      of the target OData service</a>
 * 
 */
public class GeoLocation {

    private double latitude;

    private double longtitude;

    /**
     * Constructor without parameter.
     * 
     */
    public GeoLocation() {
        super();
    }

    /**
     * Returns the value of the "latitude" attribute.
     * 
     * @return The value of the "latitude" attribute.
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Returns the value of the "longtitude" attribute.
     * 
     * @return The value of the "longtitude" attribute.
     */
    public double getLongtitude() {
        return longtitude;
    }

    /**
     * Sets the value of the "latitude" attribute.
     * 
     * @param latitude
     *            The value of the "latitude" attribute.
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * Sets the value of the "longtitude" attribute.
     * 
     * @param longtitude
     *            The value of the "longtitude" attribute.
     */
    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
    }

}