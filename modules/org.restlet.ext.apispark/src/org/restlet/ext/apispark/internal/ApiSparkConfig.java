/**
 * Copyright 2005-2014 Restlet
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: Apache 2.0 or LGPL 3.0 or LGPL 2.1 or CDDL 1.0 or EPL
 * 1.0 (the "Licenses"). You can select the license that you prefer but you may
 * not use this file except in compliance with one of these Licenses.
 * 
 * You can obtain a copy of the Apache 2.0 license at
 * http://www.opensource.org/licenses/apache-2.0
 * 
 * You can obtain a copy of the LGPL 3.0 license at
 * http://www.opensource.org/licenses/lgpl-3.0
 * 
 * You can obtain a copy of the LGPL 2.1 license at
 * http://www.opensource.org/licenses/lgpl-2.1
 * 
 * You can obtain a copy of the CDDL 1.0 license at
 * http://www.opensource.org/licenses/cddl1
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

package org.restlet.ext.apispark.internal;

import org.restlet.ext.apispark.ApiSparkService;

/**
 * TODO I'm not convinced by the presence of such configuration bean. The
 * service really hosts the configuration.
 * 
 * @author Manuel Boillod
 */
public class ApiSparkConfig {

    private char[] agentPassword;

    private String agentServiceUrl = ApiSparkService.DEFAULT_AGENT_SERVICE_URL;

    private String agentLogin;

    private Integer agentCellId;

    private Integer agentCellVersion;

    private boolean reverseProxyEnabled;

    private String reverseProxyTargetUrl;

    public String getAgentPassword() {
        return agentPassword != null ? new String(agentPassword) : null;
    }

    public String getAgentServiceUrl() {
        return agentServiceUrl;
    }

    public String getAgentLogin() {
        return agentLogin;
    }

    public Integer getAgentCellId() {
        return agentCellId;
    }

    public Integer getAgentCellVersion() {
        return agentCellVersion;
    }

    public String getReverseProxyTargetUrl() {
        return reverseProxyTargetUrl;
    }

    public boolean isReverserProxyEnabled() {
        return reverseProxyEnabled;
    }

    public void setAgentPassword(char[] agentPassword) {
        this.agentPassword = agentPassword;
    }

    public void setAgentSecret(String agentSecret) {
        this.agentPassword = agentSecret != null ? agentSecret.toCharArray()
                : null;
    }

    public void setAgentServiceUrl(String agentServiceUrl) {
        this.agentServiceUrl = agentServiceUrl;
    }

    public void setAgentLogin(String agentLogin) {
        this.agentLogin = agentLogin;
    }

    public void setAgentCellId(Integer cell) {
        this.agentCellId = cell;
    }

    public void setAgentCellVersion(Integer cellVersion) {
        this.agentCellVersion = cellVersion;
    }

    public void setReverseProxyEnabled(boolean reverseProxyEnabled) {
        this.reverseProxyEnabled = reverseProxyEnabled;
    }

    public void setReverseProxyTargetUrl(String reverseProxyTargetUrl) {
        this.reverseProxyTargetUrl = reverseProxyTargetUrl;
    }

}