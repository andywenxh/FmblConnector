
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
    "header",
    "TransientData",
    "MsgPayload"
})
public class FmblMessage implements HialRecord {

    @JsonProperty("header")
    private Header header;
    @JsonProperty("TransientData")
    private TransientData transientData;
    @JsonProperty("MsgPayload")
    private String msgPayload;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("header")
    public Header getHeader() {
        return header;
    }

    @JsonProperty("header")
    public void setHeader(Header header) {
        this.header = header;
    }

    @JsonProperty("TransientData")
    public TransientData getTransientData() {
        return transientData;
    }

    @JsonProperty("TransientData")
    public void setTransientData(TransientData transientData) {
        this.transientData = transientData;
    }

    @JsonProperty("MsgPayload")
    public String getMsgPayload() {
        return msgPayload;
    }

    @JsonProperty("MsgPayload")
    public void setMsgPayload(String msgPayload) {
        this.msgPayload = msgPayload;
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
