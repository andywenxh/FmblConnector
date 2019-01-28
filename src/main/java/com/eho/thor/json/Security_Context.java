
package com.eho.thor.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "on_Behalf_Of",
    "authentication_Level",
    "authentication_Result",
    "authentication_Result_Expiry",
    "authorization_Result",
    "authorization_Result_Expiry",
    "SAML_Token_Issuer",
    "authenticated_System",
    "originating_System",
    "under_Authority_Of",
    "user_Subject",
    "list_Of_Obligations"
})
public class Security_Context implements HialRecord{

    @JsonProperty("on_Behalf_Of")
    private String on_Behalf_Of;
    @JsonProperty("authentication_Level")
    private String authentication_Level;
    @JsonProperty("authentication_Result")
    private String authentication_Result;
    @JsonProperty("authentication_Result_Expiry")
    private String authentication_Result_Expiry;
    @JsonProperty("authorization_Result")
    private String authorization_Result;
    @JsonProperty("authorization_Result_Expiry")
    private String authorization_Result_Expiry;
    @JsonProperty("SAML_Token_Issuer")
    private String sAML_Token_Issuer;
    @JsonProperty("authenticated_System")
    private String authenticated_System;
    @JsonProperty("originating_System")
    private String originating_System;
    @JsonProperty("under_Authority_Of")
    private String under_Authority_Of;
    @JsonProperty("user_Subject")
    private String user_Subject;
    @JsonProperty("list_Of_Obligations")
    private String list_Of_Obligations;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("on_Behalf_Of")
    public String getOn_Behalf_Of() {
        return on_Behalf_Of;
    }

    @JsonProperty("on_Behalf_Of")
    public void setOn_Behalf_Of(String on_Behalf_Of) {
        this.on_Behalf_Of = on_Behalf_Of;
    }

    @JsonProperty("authentication_Level")
    public String getAuthentication_Level() {
        return authentication_Level;
    }

    @JsonProperty("authentication_Level")
    public void setAuthentication_Level(String authentication_Level) {
        this.authentication_Level = authentication_Level;
    }

    @JsonProperty("authentication_Result")
    public String getAuthentication_Result() {
        return authentication_Result;
    }

    @JsonProperty("authentication_Result")
    public void setAuthentication_Result(String authentication_Result) {
        this.authentication_Result = authentication_Result;
    }

    @JsonProperty("authentication_Result_Expiry")
    public String getAuthentication_Result_Expiry() {
        return authentication_Result_Expiry;
    }

    @JsonProperty("authentication_Result_Expiry")
    public void setAuthentication_Result_Expiry(String authentication_Result_Expiry) {
        this.authentication_Result_Expiry = authentication_Result_Expiry;
    }

    @JsonProperty("authorization_Result")
    public String getAuthorization_Result() {
        return authorization_Result;
    }

    @JsonProperty("authorization_Result")
    public void setAuthorization_Result(String authorization_Result) {
        this.authorization_Result = authorization_Result;
    }

    @JsonProperty("authorization_Result_Expiry")
    public String getAuthorization_Result_Expiry() {
        return authorization_Result_Expiry;
    }

    @JsonProperty("authorization_Result_Expiry")
    public void setAuthorization_Result_Expiry(String authorization_Result_Expiry) {
        this.authorization_Result_Expiry = authorization_Result_Expiry;
    }

    @JsonProperty("SAML_Token_Issuer")
    public String getSAML_Token_Issuer() {
        return sAML_Token_Issuer;
    }

    @JsonProperty("SAML_Token_Issuer")
    public void setSAML_Token_Issuer(String sAML_Token_Issuer) {
        this.sAML_Token_Issuer = sAML_Token_Issuer;
    }

    @JsonProperty("authenticated_System")
    public String getAuthenticated_System() {
        return authenticated_System;
    }

    @JsonProperty("authenticated_System")
    public void setAuthenticated_System(String authenticated_System) {
        this.authenticated_System = authenticated_System;
    }

    @JsonProperty("originating_System")
    public String getOriginating_System() {
        return originating_System;
    }

    @JsonProperty("originating_System")
    public void setOriginating_System(String originating_System) {
        this.originating_System = originating_System;
    }

    @JsonProperty("under_Authority_Of")
    public String getUnder_Authority_Of() {
        return under_Authority_Of;
    }

    @JsonProperty("under_Authority_Of")
    public void setUnder_Authority_Of(String under_Authority_Of) {
        this.under_Authority_Of = under_Authority_Of;
    }

    @JsonProperty("user_Subject")
    public String getUser_Subject() {
        return user_Subject;
    }

    @JsonProperty("user_Subject")
    public void setUser_Subject(String user_Subject) {
        this.user_Subject = user_Subject;
    }

    @JsonProperty("list_Of_Obligations")
    public String getList_Of_Obligations() {
        return list_Of_Obligations;
    }

    @JsonProperty("list_Of_Obligations")
    public void setList_Of_Obligations(String list_Of_Obligations) {
        this.list_Of_Obligations = list_Of_Obligations;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
