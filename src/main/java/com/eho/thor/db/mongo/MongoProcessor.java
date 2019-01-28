package com.eho.thor.db.mongo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.eho.thor.db.DBProcessor;
import com.eho.thor.json.FmblMessage;
import com.eho.thor.json.HialRecord;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoProcessor implements DBProcessor{

	
	private static final MongoProcessor instance = new MongoProcessor();
	
	
	private static MongoClient mongoClient = null;
	
	
	private MongoProcessor() {
	}
	
	
	private synchronized MongoClient getClient() {		
		if( mongoClient == null ) {
			mongoClient = new MongoClient( "10.69.5.61" , 31017 );
		}		
		return mongoClient;
	}	
	
	public static MongoProcessor getInstance() {
		return instance;
	}	
	
	@Override
	public void writeToDB(FmblMessage fmblMessage,  String fmblFullName) throws IllegalAccessException {
		
//		MongoDatabase mongoDatabase = null;
		MongoClient client = this.getClient();
        MongoDatabase mongoDatabase = client.getDatabase("fmbl");
        String txnId = fmblMessage.getHeader().getTransaction_ID();
        String activity = fmblMessage.getHeader().getActivity();

        this.saveRecordToCollection(mongoDatabase, fmblMessage.getTransientData().getTransaction_Flow(), "transactionFlow", txnId);
        this.saveRecordToCollection(mongoDatabase, fmblMessage.getTransientData().getSecurity_Context(), "securityContext", txnId);       
        if( fmblMessage.getTransientData().getError() != null && fmblMessage.getTransientData().getError().getBusiness_Error()!=null) {
        	this.saveRecordToCollection(mongoDatabase, fmblMessage.getTransientData().getError().getBusiness_Error(), "businessError", txnId);      
        }

        if( fmblMessage.getTransientData().getPolicy_And_Rules() != null ) {
        	this.saveRecordsToCollection(mongoDatabase, fmblMessage.getTransientData().getPolicy_And_Rules(), "policyAndRules", txnId);
        }
	}
	


	private void populateDocument(Document document, Object jsonObject) throws IllegalAccessException {
        
        Field[] fields = jsonObject.getClass().getDeclaredFields();
        for(Field field : fields) {
        	
        	field.setAccessible(true);

        	if ( field.isAnnotationPresent( JsonProperty.class ) ) {        		
        		 String fieldName = field.getName();
        		 String value = field.get(jsonObject).toString();        		 
        		 document.append(fieldName, value);
        		 System.out.printf("", fieldName, value);
        	}
        }
	}
	
	private void saveRecordToCollection(MongoDatabase mongoDatabase, HialRecord hialRecord, String collectionName, String txnId ) throws IllegalAccessException{
		
        Document document = new Document();
        if( txnId!=null && txnId.length()>0 ) {
        	document.append("Transaction_ID", txnId);
        }
        this.populateDocument(document, hialRecord);        

        List<Document> documents = new ArrayList<Document>();  
        documents.add(document);  
        
        MongoCollection<Document> collection = mongoDatabase.getCollection(collectionName);
        collection.insertMany(documents);		
	}
	
	
	private void saveRecordsToCollection(MongoDatabase mongoDatabase, List<? extends HialRecord> hialRecords, String collectionName, String txnId ) throws IllegalAccessException{
		
		List<Document> documents = new ArrayList<Document>();  

		for(HialRecord hialRecord : hialRecords) {
			Document document = new Document();   
	        if( txnId!=null && txnId.length()>0 ) {
	        	document.append("Transaction_ID", txnId);
	        }
			this.populateDocument(document, hialRecord);        
			documents.add(document);  
		}
        
        MongoCollection<Document> collection = mongoDatabase.getCollection(collectionName);
        collection.insertMany(documents);		
	}	


//	private void saveTransactionFlow(MongoDatabase mongoDatabase, FmblMessage fmblMessage) throws IllegalAccessException {
//
//		Transaction_Flow txnFlow = fmblMessage.getTransientData().getTransaction_Flow();
//        Document document = new Document();        
//        this.populateDocument(document, txnFlow);        
//
//        List<Document> documents = new ArrayList<Document>();  
//        documents.add(document);  
//        
//        MongoCollection<Document> collection = mongoDatabase.getCollection("policyAndRules");
//        collection.insertMany(documents);       
//        
//	}


	//for test only
	public static void getMongo() {
        MongoClient mongoClient = new MongoClient( "10.69.5.61" , 31017 );
        
        MongoDatabase mongoDatabase = mongoClient.getDatabase("fmbl");  
        
        Document document = new Document("transactionId", "6bff7863-2b60-4b0d-a33d-c067d3dee2b4").  
        append("policy_Name", "RestfulSecurityContextPolicy_Default_91c9f6a3-6a51-45eb-a7f5-487e3533841b").
        append("policy_Type", "WS-Mediation").
        append("rule_Response", "Executed");          
        
        List<Document> documents = new ArrayList<Document>();  
        documents.add(document);  
        
        MongoCollection<Document> collection = mongoDatabase.getCollection("policyAndRules");
        collection.insertMany(documents);  
        
        mongoClient.close();
	}
	
	
	
	
	public static void main(String[] args) {
 	}



}
