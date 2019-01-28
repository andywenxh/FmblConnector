
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
    "delivery_Method",
    "gateway_End_Time",
    "gateway_Start_Time",
    "global_ID",
    "global_ID_Assigner",
    "HIB_End_Time",
    "HIB_Start_Time",
    "is_Asynchronous",
    "request_Message_Size",
    "response_Message_Size",
    "message_ID",
    "operation",
    "originating_System",
    "response_Delivery_Endpoint",
    "response_Message_ID",
    "response_URL",
    "consumer_Organization",
    "consumer_System",
    "consumer",
    "sequence_ID",
    "service_Name",
    "service_Version",
    "SLA",
    "transaction_ID",
    "consumer_Message_ID",
    "eHealth_Transaction_ID",
    "LOB_Repository_ID"
})
public class Transaction_Flow implements HialRecord{

    @JsonProperty("delivery_Method")
    private String delivery_Method;
    @JsonProperty("gateway_End_Time")
    private String gateway_End_Time;
    @JsonProperty("gateway_Start_Time")
    private String gateway_Start_Time;
    @JsonProperty("global_ID")
    private String global_ID;
    @JsonProperty("global_ID_Assigner")
    private String global_ID_Assigner;
    @JsonProperty("HIB_End_Time")
    private String hIB_End_Time;
    @JsonProperty("HIB_Start_Time")
    private String hIB_Start_Time;
    @JsonProperty("is_Asynchronous")
    private String is_Asynchronous;
    @JsonProperty("request_Message_Size")
    private String request_Message_Size;
    @JsonProperty("response_Message_Size")
    private String response_Message_Size;
    @JsonProperty("message_ID")
    private String message_ID;
    @JsonProperty("operation")
    private String operation;
    @JsonProperty("originating_System")
    private String originating_System;
    @JsonProperty("response_Delivery_Endpoint")
    private String response_Delivery_Endpoint;
    @JsonProperty("response_Message_ID")
    private String response_Message_ID;
    @JsonProperty("response_URL")
    private String response_URL;
    @JsonProperty("consumer_Organization")
    private String consumer_Organization;
    @JsonProperty("consumer_System")
    private String consumer_System;
    @JsonProperty("consumer")
    private String consumer;
    @JsonProperty("sequence_ID")
    private String sequence_ID;
    @JsonProperty("service_Name")
    private String service_Name;
    @JsonProperty("service_Version")
    private String service_Version;
    @JsonProperty("SLA")
    private String sLA;
    @JsonProperty("transaction_ID")
    private String transaction_ID;
    @JsonProperty("consumer_Message_ID")
    private String consumer_Message_ID;
    @JsonProperty("eHealth_Transaction_ID")
    private String eHealth_Transaction_ID;
    @JsonProperty("LOB_Repository_ID")
    private String lOB_Repository_ID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("delivery_Method")
    public String getDelivery_Method() {
        return delivery_Method;
    }

    @JsonProperty("delivery_Method")
    public void setDelivery_Method(String delivery_Method) {
        this.delivery_Method = delivery_Method;
    }

    @JsonProperty("gateway_End_Time")
    public String getGateway_End_Time() {
        return gateway_End_Time;
    }

    @JsonProperty("gateway_End_Time")
    public void setGateway_End_Time(String gateway_End_Time) {
        this.gateway_End_Time = gateway_End_Time;
    }

    @JsonProperty("gateway_Start_Time")
    public String getGateway_Start_Time() {
        return gateway_Start_Time;
    }

    @JsonProperty("gateway_Start_Time")
    public void setGateway_Start_Time(String gateway_Start_Time) {
        this.gateway_Start_Time = gateway_Start_Time;
    }

    @JsonProperty("global_ID")
    public String getGlobal_ID() {
        return global_ID;
    }

    @JsonProperty("global_ID")
    public void setGlobal_ID(String global_ID) {
        this.global_ID = global_ID;
    }

    @JsonProperty("global_ID_Assigner")
    public String getGlobal_ID_Assigner() {
        return global_ID_Assigner;
    }

    @JsonProperty("global_ID_Assigner")
    public void setGlobal_ID_Assigner(String global_ID_Assigner) {
        this.global_ID_Assigner = global_ID_Assigner;
    }

    @JsonProperty("HIB_End_Time")
    public String getHIB_End_Time() {
        return hIB_End_Time;
    }

    @JsonProperty("HIB_End_Time")
    public void setHIB_End_Time(String hIB_End_Time) {
        this.hIB_End_Time = hIB_End_Time;
    }

    @JsonProperty("HIB_Start_Time")
    public String getHIB_Start_Time() {
        return hIB_Start_Time;
    }

    @JsonProperty("HIB_Start_Time")
    public void setHIB_Start_Time(String hIB_Start_Time) {
        this.hIB_Start_Time = hIB_Start_Time;
    }

    @JsonProperty("is_Asynchronous")
    public String getIs_Asynchronous() {
        return is_Asynchronous;
    }

    @JsonProperty("is_Asynchronous")
    public void setIs_Asynchronous(String is_Asynchronous) {
        this.is_Asynchronous = is_Asynchronous;
    }

    @JsonProperty("request_Message_Size")
    public String getRequest_Message_Size() {
        return request_Message_Size;
    }

    @JsonProperty("request_Message_Size")
    public void setRequest_Message_Size(String request_Message_Size) {
        this.request_Message_Size = request_Message_Size;
    }

    @JsonProperty("response_Message_Size")
    public String getResponse_Message_Size() {
        return response_Message_Size;
    }

    @JsonProperty("response_Message_Size")
    public void setResponse_Message_Size(String response_Message_Size) {
        this.response_Message_Size = response_Message_Size;
    }

    @JsonProperty("message_ID")
    public String getMessage_ID() {
        return message_ID;
    }

    @JsonProperty("message_ID")
    public void setMessage_ID(String message_ID) {
        this.message_ID = message_ID;
    }

    @JsonProperty("operation")
    public String getOperation() {
        return operation;
    }

    @JsonProperty("operation")
    public void setOperation(String operation) {
        this.operation = operation;
    }

    @JsonProperty("originating_System")
    public String getOriginating_System() {
        return originating_System;
    }

    @JsonProperty("originating_System")
    public void setOriginating_System(String originating_System) {
        this.originating_System = originating_System;
    }

    @JsonProperty("response_Delivery_Endpoint")
    public String getResponse_Delivery_Endpoint() {
        return response_Delivery_Endpoint;
    }

    @JsonProperty("response_Delivery_Endpoint")
    public void setResponse_Delivery_Endpoint(String response_Delivery_Endpoint) {
        this.response_Delivery_Endpoint = response_Delivery_Endpoint;
    }

    @JsonProperty("response_Message_ID")
    public String getResponse_Message_ID() {
        return response_Message_ID;
    }

    @JsonProperty("response_Message_ID")
    public void setResponse_Message_ID(String response_Message_ID) {
        this.response_Message_ID = response_Message_ID;
    }

    @JsonProperty("response_URL")
    public String getResponse_URL() {
        return response_URL;
    }

    @JsonProperty("response_URL")
    public void setResponse_URL(String response_URL) {
        this.response_URL = response_URL;
    }

    @JsonProperty("consumer_Organization")
    public String getConsumer_Organization() {
        return consumer_Organization;
    }

    @JsonProperty("consumer_Organization")
    public void setConsumer_Organization(String consumer_Organization) {
        this.consumer_Organization = consumer_Organization;
    }

    @JsonProperty("consumer_System")
    public String getConsumer_System() {
        return consumer_System;
    }

    @JsonProperty("consumer_System")
    public void setConsumer_System(String consumer_System) {
        this.consumer_System = consumer_System;
    }

    @JsonProperty("consumer")
    public String getConsumer() {
        return consumer;
    }

    @JsonProperty("consumer")
    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    @JsonProperty("sequence_ID")
    public String getSequence_ID() {
        return sequence_ID;
    }

    @JsonProperty("sequence_ID")
    public void setSequence_ID(String sequence_ID) {
        this.sequence_ID = sequence_ID;
    }

    @JsonProperty("service_Name")
    public String getService_Name() {
        return service_Name;
    }

    @JsonProperty("service_Name")
    public void setService_Name(String service_Name) {
        this.service_Name = service_Name;
    }

    @JsonProperty("service_Version")
    public String getService_Version() {
        return service_Version;
    }

    @JsonProperty("service_Version")
    public void setService_Version(String service_Version) {
        this.service_Version = service_Version;
    }

    @JsonProperty("SLA")
    public String getSLA() {
        return sLA;
    }

    @JsonProperty("SLA")
    public void setSLA(String sLA) {
        this.sLA = sLA;
    }

    @JsonProperty("transaction_ID")
    public String getTransaction_ID() {
        return transaction_ID;
    }

    @JsonProperty("transaction_ID")
    public void setTransaction_ID(String transaction_ID) {
        this.transaction_ID = transaction_ID;
    }

    @JsonProperty("consumer_Message_ID")
    public String getConsumer_Message_ID() {
        return consumer_Message_ID;
    }

    @JsonProperty("consumer_Message_ID")
    public void setConsumer_Message_ID(String consumer_Message_ID) {
        this.consumer_Message_ID = consumer_Message_ID;
    }

    @JsonProperty("eHealth_Transaction_ID")
    public String getEHealth_Transaction_ID() {
        return eHealth_Transaction_ID;
    }

    @JsonProperty("eHealth_Transaction_ID")
    public void setEHealth_Transaction_ID(String eHealth_Transaction_ID) {
        this.eHealth_Transaction_ID = eHealth_Transaction_ID;
    }

    @JsonProperty("LOB_Repository_ID")
    public String getLOB_Repository_ID() {
        return lOB_Repository_ID;
    }

    @JsonProperty("LOB_Repository_ID")
    public void setLOB_Repository_ID(String lOB_Repository_ID) {
        this.lOB_Repository_ID = lOB_Repository_ID;
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
