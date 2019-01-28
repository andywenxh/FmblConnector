
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
    "facility",
    "log_group",
    "activity",
    "Severity",
    "transaction_ID"
})
public class Header implements HialRecord{

    @JsonProperty("facility")
    private String facility;
    @JsonProperty("log_group")
    private String log_group;
    @JsonProperty("activity")
    private String activity;
    @JsonProperty("Severity")
    private String severity;
    @JsonProperty("transaction_ID")
    private String transaction_ID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("facility")
    public String getFacility() {
        return facility;
    }

    @JsonProperty("facility")
    public void setFacility(String facility) {
        this.facility = facility;
    }

    @JsonProperty("log_group")
    public String getLog_group() {
        return log_group;
    }

    @JsonProperty("log_group")
    public void setLog_group(String log_group) {
        this.log_group = log_group;
    }

    @JsonProperty("activity")
    public String getActivity() {
        return activity;
    }

    @JsonProperty("activity")
    public void setActivity(String activity) {
        this.activity = activity;
    }

    @JsonProperty("Severity")
    public String getSeverity() {
        return severity;
    }

    @JsonProperty("Severity")
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @JsonProperty("transaction_ID")
    public String getTransaction_ID() {
        return transaction_ID;
    }

    @JsonProperty("transaction_ID")
    public void setTransaction_ID(String transaction_ID) {
        this.transaction_ID = transaction_ID;
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
