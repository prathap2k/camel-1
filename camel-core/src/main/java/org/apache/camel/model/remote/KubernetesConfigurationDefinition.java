/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.model.remote;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.camel.spi.Metadata;

/**
 * Kubernetes remote service call configuration
 */
@Metadata(label = "eip,routing,remote")
@XmlRootElement(name = "kubernetesConfiguration")
@XmlAccessorType(XmlAccessType.FIELD)
public class KubernetesConfigurationDefinition extends ServiceCallConfigurationDefinition {

    @XmlAttribute
    @Metadata(required = "true")
    private String masterUrl;
    @XmlAttribute
    private String namespace;
    @XmlAttribute
    private String apiVersion;
    @XmlAttribute @Metadata(label = "security")
    private String username;
    @XmlAttribute @Metadata(label = "security")
    private String password;
    @XmlAttribute @Metadata(label = "security")
    private String oauthToken;
    @XmlAttribute @Metadata(label = "security")
    private String caCertData;
    @XmlAttribute @Metadata(label = "security")
    private String caCertFile;
    @XmlAttribute @Metadata(label = "security")
    private String clientCertData;
    @XmlAttribute @Metadata(label = "security")
    private String clientCertFile;
    @XmlAttribute @Metadata(label = "security")
    private String clientKeyAlgo;
    @XmlAttribute @Metadata(label = "security")
    private String clientKeyData;
    @XmlAttribute @Metadata(label = "security")
    private String clientKeyFile;
    @XmlAttribute @Metadata(label = "security")
    private String clientKeyPassphrase;
    @XmlAttribute @Metadata(label = "security")
    private Boolean trustCerts;

    public KubernetesConfigurationDefinition() {
    }

    public KubernetesConfigurationDefinition(ServiceCallDefinition parent) {
        super(parent);
    }

    // Getter/Setter
    // -------------------------------------------------------------------------


    public String getMasterUrl() {
        return masterUrl;
    }

    public void setMasterUrl(String masterUrl) {
        this.masterUrl = masterUrl;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOauthToken() {
        return oauthToken;
    }

    public void setOauthToken(String oauthToken) {
        this.oauthToken = oauthToken;
    }

    public String getCaCertData() {
        return caCertData;
    }

    public void setCaCertData(String caCertData) {
        this.caCertData = caCertData;
    }

    public String getCaCertFile() {
        return caCertFile;
    }

    public void setCaCertFile(String caCertFile) {
        this.caCertFile = caCertFile;
    }

    public String getClientCertData() {
        return clientCertData;
    }

    public void setClientCertData(String clientCertData) {
        this.clientCertData = clientCertData;
    }

    public String getClientCertFile() {
        return clientCertFile;
    }

    public void setClientCertFile(String clientCertFile) {
        this.clientCertFile = clientCertFile;
    }

    public String getClientKeyAlgo() {
        return clientKeyAlgo;
    }

    public void setClientKeyAlgo(String clientKeyAlgo) {
        this.clientKeyAlgo = clientKeyAlgo;
    }

    public String getClientKeyData() {
        return clientKeyData;
    }

    public void setClientKeyData(String clientKeyData) {
        this.clientKeyData = clientKeyData;
    }

    public String getClientKeyFile() {
        return clientKeyFile;
    }

    public void setClientKeyFile(String clientKeyFile) {
        this.clientKeyFile = clientKeyFile;
    }

    public String getClientKeyPassphrase() {
        return clientKeyPassphrase;
    }

    public void setClientKeyPassphrase(String clientKeyPassphrase) {
        this.clientKeyPassphrase = clientKeyPassphrase;
    }

    public Boolean getTrustCerts() {
        return trustCerts;
    }

    public void setTrustCerts(Boolean trustCerts) {
        this.trustCerts = trustCerts;
    }

    // Fluent API
    // -------------------------------------------------------------------------

    /**
     * Sets the URL to the master
     */
    public KubernetesConfigurationDefinition masterUrl(String masterUrl) {
        setMasterUrl(masterUrl);
        return this;
    }

    /**
     * Sets the namespace to use
     */
    public KubernetesConfigurationDefinition namespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * Sets the API version
     */
    public KubernetesConfigurationDefinition apiVersion(String apiVersion) {
        setApiVersion(apiVersion);
        return this;
    }

    /**
     * Sets the username for authentication
     */
    public KubernetesConfigurationDefinition username(String username) {
        setUsername(username);
        return this;
    }

    /**
     * Sets the password for authentication
     */
    public KubernetesConfigurationDefinition password(String password) {
        setPassword(password);
        return this;
    }

    /**
     * Sets the OAUTH token for authentication (instead of username/password)
     */
    public KubernetesConfigurationDefinition oauthToken(String oauthToken) {
        setOauthToken(oauthToken);
        return this;
    }

    /**
     * Sets the Certificate Authority data
     */
    public KubernetesConfigurationDefinition caCertData(String caCertData) {
        setCaCertData(caCertData);
        return this;
    }

    /**
     * Sets the Certificate Authority data that are loaded from the file
     */
    public KubernetesConfigurationDefinition caCertFile(String caCertFile) {
        setCaCertFile(caCertFile);
        return this;
    }

    /**
     * Sets the Client Certificate data
     */
    public KubernetesConfigurationDefinition clientCertData(String clientCertData) {
        setClientCertData(clientCertData);
        return this;
    }

    /**
     * Sets the Client Certificate data that are loaded from the file
     */
    public KubernetesConfigurationDefinition clientCertFile(String clientCertFile) {
        setClientCertFile(clientCertFile);
        return this;
    }

    /**
     * Sets the Client Keystore algorithm, such as RSA.
     */
    public KubernetesConfigurationDefinition clientKeyAlgo(String clientKeyAlgo) {
        setClientKeyAlgo(clientKeyAlgo);
        return this;
    }

    /**
     * Sets the Client Keystore data
     */
    public KubernetesConfigurationDefinition clientKeyData(String clientKeyData) {
        setClientKeyData(clientKeyData);
        return this;
    }

    /**
     * Sets the Client Keystore data that are loaded from the file
     */
    public KubernetesConfigurationDefinition clientKeyFile(String clientKeyFile) {
        setClientKeyFile(clientKeyFile);
        return this;
    }

    /**
     * Sets the Client Keystore passphrase
     */
    public KubernetesConfigurationDefinition clientKeyPassphrase(String clientKeyPassphrase) {
        setClientKeyPassphrase(clientKeyPassphrase);
        return this;
    }

    /**
     * Sets whether to turn on trust certificate check
     */
    public KubernetesConfigurationDefinition trustCerts(boolean trustCerts) {
        setTrustCerts(trustCerts);
        return this;
    }

}
