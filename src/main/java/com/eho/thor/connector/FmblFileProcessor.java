package com.eho.thor.connector;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import com.eho.thor.json.FmblMessage;

public class FmblFileProcessor {

	public FmblFileProcessor() {
		
		
	}
	
    /**
     * 
     * @param fmblMessage
     * @return
     * @throws Exception 
     */
    public static String saveFmblToFile(FmblMessage fmblMessage, String fmblFolder) throws Exception {
    	
    	Date date = new Date();
    	LocalDateTime localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    	int year  = localDate.getYear();
    	int month = localDate.getMonthValue();
    	int day   = localDate.getDayOfMonth();
    	int hour = localDate.getHour();
    	int minute = localDate.getMinute();
    	long millis = System.currentTimeMillis() % 1000;
    	
    	String txnId = fmblMessage.getHeader().getTransaction_ID();
    	String activity = fmblMessage.getHeader().getActivity();
    	
    	String folderName = String.format("%s/%04d%02d%02d/%02d%02d", fmblFolder, year, month, day, hour, minute); 
    	createFolder(folderName);
    	
    	String fileName =   String.format("%s/fmbl-%s-%s-%03d.txt", folderName, txnId, activity, millis );
    	
    	
    	Path path = Paths.get(fileName);
    	
    	Files.write(path, fmblMessage.getMsgPayload().getBytes());
    	
    	return fileName;
    }
    
    
    private static synchronized void   createFolder(String folderName) {    	
    	File folder = new File(folderName);
		if ( ! folder.exists() ) {
    		 folder.mkdirs();
    	}
    }
    
    public static void main(String[] args) throws Exception {
    	
    	
    	Date date = new Date();
    	LocalDateTime localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    	int year  = localDate.getYear();
    	int month = localDate.getMonthValue();
    	int day   = localDate.getDayOfMonth();
    	int hour = localDate.getHour();
    	int minute = localDate.getMinute();
    	long millis = System.currentTimeMillis() % 1000;
    	
    	String txnId = "asd-adfcasd-324cas32-ca8asdc";
    	String activity = "CRQ";
    	String fmblFolder = "c:/tmp/fmbl";
    	
    	String folderName = String.format("%s/%04d%02d%02d/%02d%02d",
    			                        fmblFolder, year, month, day, hour, minute); //, txnId, activity, millis );   
    	System.out.println(folderName);

//    	Path path = Paths.get("c:/tmp/question3.txt");
//    	
//    		 
//    	
//    	String question = "To be or not to be?";
//    	
//    		     
//    	
//    		Files.write(path, question.getBytes());    	
    	
    }

}
