
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
    "policy_Name",
    "policy_Type",
    "rule_Response"
})
public class Policy_And_Rule implements HialRecord{

    @JsonProperty("policy_Name")
    private String policy_Name;
    @JsonProperty("policy_Type")
    private String policy_Type;
    @JsonProperty("rule_Response")
    private String rule_Response;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("policy_Name")
    public String getPolicy_Name() {
        return policy_Name;
    }

    @JsonProperty("policy_Name")
    public void setPolicy_Name(String policy_Name) {
        this.policy_Name = policy_Name;
    }

    @JsonProperty("policy_Type")
    public String getPolicy_Type() {
        return policy_Type;
    }

    @JsonProperty("policy_Type")
    public void setPolicy_Type(String policy_Type) {
        this.policy_Type = policy_Type;
    }

    @JsonProperty("rule_Response")
    public String getRule_Response() {
        return rule_Response;
    }

    @JsonProperty("rule_Response")
    public void setRule_Response(String rule_Response) {
        this.rule_Response = rule_Response;
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
