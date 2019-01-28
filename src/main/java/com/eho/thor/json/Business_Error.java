
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
    "error_Activity",
    "error_Category",
    "error_Code",
    "error_Description",
    "error_Node_Name",
    "error_NodeID",
    "error_Reference",
    "error_Severity",
    "error_Timestamp",
    "segment_Code"
})
public class Business_Error implements HialRecord{

    @JsonProperty("error_Activity")
    private String error_Activity;
    @JsonProperty("error_Category")
    private String error_Category;
    @JsonProperty("error_Code")
    private String error_Code;
    @JsonProperty("error_Description")
    private String error_Description;
    @JsonProperty("error_Node_Name")
    private String error_Node_Name;
    @JsonProperty("error_NodeID")
    private String error_NodeID;
    @JsonProperty("error_Reference")
    private String error_Reference;
    @JsonProperty("error_Severity")
    private String error_Severity;
    @JsonProperty("error_Timestamp")
    private String error_Timestamp;
    @JsonProperty("segment_Code")
    private String segment_Code;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("error_Activity")
    public String getError_Activity() {
        return error_Activity;
    }

    @JsonProperty("error_Activity")
    public void setError_Activity(String error_Activity) {
        this.error_Activity = error_Activity;
    }

    @JsonProperty("error_Category")
    public String getError_Category() {
        return error_Category;
    }

    @JsonProperty("error_Category")
    public void setError_Category(String error_Category) {
        this.error_Category = error_Category;
    }

    @JsonProperty("error_Code")
    public String getError_Code() {
        return error_Code;
    }

    @JsonProperty("error_Code")
    public void setError_Code(String error_Code) {
        this.error_Code = error_Code;
    }

    @JsonProperty("error_Description")
    public String getError_Description() {
        return error_Description;
    }

    @JsonProperty("error_Description")
    public void setError_Description(String error_Description) {
        this.error_Description = error_Description;
    }

    @JsonProperty("error_Node_Name")
    public String getError_Node_Name() {
        return error_Node_Name;
    }

    @JsonProperty("error_Node_Name")
    public void setError_Node_Name(String error_Node_Name) {
        this.error_Node_Name = error_Node_Name;
    }

    @JsonProperty("error_NodeID")
    public String getError_NodeID() {
        return error_NodeID;
    }

    @JsonProperty("error_NodeID")
    public void setError_NodeID(String error_NodeID) {
        this.error_NodeID = error_NodeID;
    }

    @JsonProperty("error_Reference")
    public String getError_Reference() {
        return error_Reference;
    }

    @JsonProperty("error_Reference")
    public void setError_Reference(String error_Reference) {
        this.error_Reference = error_Reference;
    }

    @JsonProperty("error_Severity")
    public String getError_Severity() {
        return error_Severity;
    }

    @JsonProperty("error_Severity")
    public void setError_Severity(String error_Severity) {
        this.error_Severity = error_Severity;
    }

    @JsonProperty("error_Timestamp")
    public String getError_Timestamp() {
        return error_Timestamp;
    }

    @JsonProperty("error_Timestamp")
    public void setError_Timestamp(String error_Timestamp) {
        this.error_Timestamp = error_Timestamp;
    }

    @JsonProperty("segment_Code")
    public String getSegment_Code() {
        return segment_Code;
    }

    @JsonProperty("segment_Code")
    public void setSegment_Code(String segment_Code) {
        this.segment_Code = segment_Code;
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
