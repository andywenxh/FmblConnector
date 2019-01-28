package com.eho.thor.json.run;

import java.io.File;

import com.eho.thor.db.mongo.MongoProcessor;
import com.eho.thor.json.FmblMessage;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MessageLoader {

	public MessageLoader() {

	}

	public static void loadObj(String fileName) throws Exception  {
		ObjectMapper mapper = new ObjectMapper();
		File file = new File(".\\fmbl.json");
		
		if( file.exists() ) {
		   FmblMessage msg = mapper.readValue( file, FmblMessage.class );
		   System.out.println(msg);
		   
		   for(int i = 0; i< 2; i++ )
		   MongoProcessor.getInstance().writeToDB(msg, "");
		}
	}
	
	public static void main(String[] args) throws Exception  {
		loadObj("");
	}
}
