package com.eho.thor.entity;
//
import java.io.Serializable;
//import javax.persistence.*;
//import java.math.BigDecimal;
//import java.sql.Timestamp;
//
//
///**
// * The persistent class for the TRANSACTION_FLOW database table.
// * 
// */
//@Entity
//@Table(name="TRANSACTION_FLOW")
//@NamedQuery(name="TransactionFlow.findAll", query="SELECT t FROM TransactionFlow t")
public class TransactionFlow implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	@Id
//	@Column(name="TRANSACTION_ID")
//	private String transactionId;
//
//	private String consumer;
//
//	@Column(name="CONSUMER_MESSAGE_ID")
//	private String consumerMessageId;
//
//	@Column(name="CONSUMER_ORGANIZATION")
//	private String consumerOrganization;
//
//	@Column(name="CONSUMER_SYSTEM")
//	private String consumerSystem;
//
//	@Column(name="DELIVERY_METHOD")
//	private String deliveryMethod;
//
//	@Column(name="EHEALTH_TRANSACTION_ID")
//	private String ehealthTransactionId;
//
//	@Column(name="GATEWAY_END_TIME")
//	private Timestamp gatewayEndTime;
//
//	@Column(name="GATEWAY_START_TIME")
//	private Timestamp gatewayStartTime;
//
//	@Column(name="GLOBAL_ID")
//	private String globalId;
//
//	@Column(name="GLOBAL_ID_ASSIGNER")
//	private String globalIdAssigner;
//
//	@Column(name="HIB_END_TIME")
//	private Timestamp hibEndTime;
//
//	@Column(name="HIB_START_TIME")
//	private Timestamp hibStartTime;
//
//	@Column(name="IS_ASYNCHRONOUS")
//	private String isAsynchronous;
//
//	@Column(name="LOB_REPOSITORY_ID")
//	private String lobRepositoryId;
//
//	@Column(name="MESSAGE_ID")
//	private String messageId;
//
//	private String operation;
//
//	@Column(name="ORIGINATING_SYSTEM")
//	private String originatingSystem;
//
//	@Column(name="RECORD_INSERT_TIME")
//	private Timestamp recordInsertTime;
//
//	@Column(name="REQUEST_MESSAGE_SIZE")
//	private BigDecimal requestMessageSize;
//
//	@Column(name="RESPONSE_DELIVERY_ENDPOINT")
//	private String responseDeliveryEndpoint;
//
//	@Column(name="RESPONSE_MESSAGE_ID")
//	private String responseMessageId;
//
//	@Column(name="RESPONSE_MESSAGE_SIZE")
//	private BigDecimal responseMessageSize;
//
//	@Column(name="RESPONSE_URL")
//	private String responseUrl;
//
//	@Column(name="SEQUENCE_ID")
//	private String sequenceId;
//
//	@Column(name="SERVICE_NAME")
//	private String serviceName;
//
//	@Column(name="SERVICE_VERSION")
//	private String serviceVersion;
//
//	private String sla;
//
//	public TransactionFlow() {
//	}
//
//	public String getTransactionId() {
//		return this.transactionId;
//	}
//
//	public void setTransactionId(String transactionId) {
//		this.transactionId = transactionId;
//	}
//
//	public String getConsumer() {
//		return this.consumer;
//	}
//
//	public void setConsumer(String consumer) {
//		this.consumer = consumer;
//	}
//
//	public String getConsumerMessageId() {
//		return this.consumerMessageId;
//	}
//
//	public void setConsumerMessageId(String consumerMessageId) {
//		this.consumerMessageId = consumerMessageId;
//	}
//
//	public String getConsumerOrganization() {
//		return this.consumerOrganization;
//	}
//
//	public void setConsumerOrganization(String consumerOrganization) {
//		this.consumerOrganization = consumerOrganization;
//	}
//
//	public String getConsumerSystem() {
//		return this.consumerSystem;
//	}
//
//	public void setConsumerSystem(String consumerSystem) {
//		this.consumerSystem = consumerSystem;
//	}
//
//	public String getDeliveryMethod() {
//		return this.deliveryMethod;
//	}
//
//	public void setDeliveryMethod(String deliveryMethod) {
//		this.deliveryMethod = deliveryMethod;
//	}
//
//	public String getEhealthTransactionId() {
//		return this.ehealthTransactionId;
//	}
//
//	public void setEhealthTransactionId(String ehealthTransactionId) {
//		this.ehealthTransactionId = ehealthTransactionId;
//	}
//
//	public Timestamp getGatewayEndTime() {
//		return this.gatewayEndTime;
//	}
//
//	public void setGatewayEndTime(Timestamp gatewayEndTime) {
//		this.gatewayEndTime = gatewayEndTime;
//	}
//
//	public Timestamp getGatewayStartTime() {
//		return this.gatewayStartTime;
//	}
//
//	public void setGatewayStartTime(Timestamp gatewayStartTime) {
//		this.gatewayStartTime = gatewayStartTime;
//	}
//
//	public String getGlobalId() {
//		return this.globalId;
//	}
//
//	public void setGlobalId(String globalId) {
//		this.globalId = globalId;
//	}
//
//	public String getGlobalIdAssigner() {
//		return this.globalIdAssigner;
//	}
//
//	public void setGlobalIdAssigner(String globalIdAssigner) {
//		this.globalIdAssigner = globalIdAssigner;
//	}
//
//	public Timestamp getHibEndTime() {
//		return this.hibEndTime;
//	}
//
//	public void setHibEndTime(Timestamp hibEndTime) {
//		this.hibEndTime = hibEndTime;
//	}
//
//	public Timestamp getHibStartTime() {
//		return this.hibStartTime;
//	}
//
//	public void setHibStartTime(Timestamp hibStartTime) {
//		this.hibStartTime = hibStartTime;
//	}
//
//	public String getIsAsynchronous() {
//		return this.isAsynchronous;
//	}
//
//	public void setIsAsynchronous(String isAsynchronous) {
//		this.isAsynchronous = isAsynchronous;
//	}
//
//	public String getLobRepositoryId() {
//		return this.lobRepositoryId;
//	}
//
//	public void setLobRepositoryId(String lobRepositoryId) {
//		this.lobRepositoryId = lobRepositoryId;
//	}
//
//	public String getMessageId() {
//		return this.messageId;
//	}
//
//	public void setMessageId(String messageId) {
//		this.messageId = messageId;
//	}
//
//	public String getOperation() {
//		return this.operation;
//	}
//
//	public void setOperation(String operation) {
//		this.operation = operation;
//	}
//
//	public String getOriginatingSystem() {
//		return this.originatingSystem;
//	}
//
//	public void setOriginatingSystem(String originatingSystem) {
//		this.originatingSystem = originatingSystem;
//	}
//
//	public Timestamp getRecordInsertTime() {
//		return this.recordInsertTime;
//	}
//
//	public void setRecordInsertTime(Timestamp recordInsertTime) {
//		this.recordInsertTime = recordInsertTime;
//	}
//
//	public BigDecimal getRequestMessageSize() {
//		return this.requestMessageSize;
//	}
//
//	public void setRequestMessageSize(BigDecimal requestMessageSize) {
//		this.requestMessageSize = requestMessageSize;
//	}
//
//	public String getResponseDeliveryEndpoint() {
//		return this.responseDeliveryEndpoint;
//	}
//
//	public void setResponseDeliveryEndpoint(String responseDeliveryEndpoint) {
//		this.responseDeliveryEndpoint = responseDeliveryEndpoint;
//	}
//
//	public String getResponseMessageId() {
//		return this.responseMessageId;
//	}
//
//	public void setResponseMessageId(String responseMessageId) {
//		this.responseMessageId = responseMessageId;
//	}
//
//	public BigDecimal getResponseMessageSize() {
//		return this.responseMessageSize;
//	}
//
//	public void setResponseMessageSize(BigDecimal responseMessageSize) {
//		this.responseMessageSize = responseMessageSize;
//	}
//
//	public String getResponseUrl() {
//		return this.responseUrl;
//	}
//
//	public void setResponseUrl(String responseUrl) {
//		this.responseUrl = responseUrl;
//	}
//
//	public String getSequenceId() {
//		return this.sequenceId;
//	}
//
//	public void setSequenceId(String sequenceId) {
//		this.sequenceId = sequenceId;
//	}
//
//	public String getServiceName() {
//		return this.serviceName;
//	}
//
//	public void setServiceName(String serviceName) {
//		this.serviceName = serviceName;
//	}
//
//	public String getServiceVersion() {
//		return this.serviceVersion;
//	}
//
//	public void setServiceVersion(String serviceVersion) {
//		this.serviceVersion = serviceVersion;
//	}
//
//	public String getSla() {
//		return this.sla;
//	}
//
//	public void setSla(String sla) {
//		this.sla = sla;
//	}
//
}