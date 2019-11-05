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

import java.util.List;

import org.restlet.test.ext.odata.deepexpand.model.AuthenticatedUser;
import org.restlet.test.ext.odata.deepexpand.model.Permission;
import org.restlet.test.ext.odata.deepexpand.model.ReportType;

/**
 * Generated by the generator tool for the OData extension for the Restlet
 * framework.<br>
 * 
 * @see <a
 *      href="http://praktiki.metal.ntua.gr/CoopOData/CoopOData.svc/$metadata">Metadata
 *      of the target OData service</a>
 * 
 */
public class Role {

    private String comment;

    private int id;

    private String name;

    private Tracking tracking;

    private List<Permission> permissions;

    private List<ReportType> reportType;

    private List<AuthenticatedUser> users;

    /**
     * Constructor without parameter.
     * 
     */
    public Role() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param id
     *            The identifiant value of the entity.
     */
    public Role(int id) {
        this();
        this.id = id;
    }

    /**
     * Returns the value of the "comment" attribute.
     * 
     * @return The value of the "comment" attribute.
     */
    public String getComment() {
        return comment;
    }

    /**
     * Returns the value of the "id" attribute.
     * 
     * @return The value of the "id" attribute.
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the value of the "name" attribute.
     * 
     * @return The value of the "name" attribute.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the value of the "tracking" attribute.
     * 
     * @return The value of the "tracking" attribute.
     */
    public Tracking getTracking() {
        return tracking;
    }

    /**
     * Returns the value of the "permissions" attribute.
     * 
     * @return The value of the "permissions" attribute.
     */
    public List<Permission> getPermissions() {
        return permissions;
    }

    /**
     * Returns the value of the "reportType" attribute.
     * 
     * @return The value of the "reportType" attribute.
     */
    public List<ReportType> getReportType() {
        return reportType;
    }

    /**
     * Returns the value of the "users" attribute.
     * 
     * @return The value of the "users" attribute.
     */
    public List<AuthenticatedUser> getUsers() {
        return users;
    }

    /**
     * Sets the value of the "comment" attribute.
     * 
     * @param comment
     *            The value of the "comment" attribute.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Sets the value of the "id" attribute.
     * 
     * @param id
     *            The value of the "id" attribute.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the value of the "name" attribute.
     * 
     * @param name
     *            The value of the "name" attribute.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the value of the "tracking" attribute.
     * 
     * @param tracking
     *            The value of the "tracking" attribute.
     */
    public void setTracking(Tracking tracking) {
        this.tracking = tracking;
    }

    /**
     * Sets the value of the "permissions" attribute.
     * 
     * @param permissions
     *            " The value of the "permissions" attribute.
     */
    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    /**
     * Sets the value of the "reportType" attribute.
     * 
     * @param reportType
     *            " The value of the "reportType" attribute.
     */
    public void setReportType(List<ReportType> reportType) {
        this.reportType = reportType;
    }

    /**
     * Sets the value of the "users" attribute.
     * 
     * @param users
     *            " The value of the "users" attribute.
     */
    public void setUsers(List<AuthenticatedUser> users) {
        this.users = users;
    }

}