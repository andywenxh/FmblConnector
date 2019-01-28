
package com.eho.thor.json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Error",
    "Transaction_Flow",
    "Policy_And_Rules",
    "Security_Context"
})
public class TransientData implements HialRecord{

    @JsonProperty("Error")
    private Error error;
    @JsonProperty("Transaction_Flow")
    private Transaction_Flow transaction_Flow;
    @JsonProperty("Policy_And_Rules")
    private List<Policy_And_Rule> policy_And_Rules = null;
    @JsonProperty("Security_Context")
    private Security_Context security_Context;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Error")
    public Error getError() {
        return error;
    }

    @JsonProperty("Error")
    public void setError(Error error) {
        this.error = error;
    }

    @JsonProperty("Transaction_Flow")
    public Transaction_Flow getTransaction_Flow() {
        return transaction_Flow;
    }

    @JsonProperty("Transaction_Flow")
    public void setTransaction_Flow(Transaction_Flow transaction_Flow) {
        this.transaction_Flow = transaction_Flow;
    }

    @JsonProperty("Policy_And_Rules")
    public List<Policy_And_Rule> getPolicy_And_Rules() {
        return policy_And_Rules;
    }

    @JsonProperty("Policy_And_Rules")
    public void setPolicy_And_Rules(List<Policy_And_Rule> policy_And_Rules) {
        this.policy_And_Rules = policy_And_Rules;
    }

    @JsonProperty("Security_Context")
    public Security_Context getSecurity_Context() {
        return security_Context;
    }

    @JsonProperty("Security_Context")
    public void setSecurity_Context(Security_Context security_Context) {
        this.security_Context = security_Context;
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
