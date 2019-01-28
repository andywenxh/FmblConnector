/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.eho.thor.connector;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collection;
import java.util.Map;

import org.apache.kafka.clients.consumer.OffsetAndMetadata;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.connect.errors.ConnectException;
import org.apache.kafka.connect.sink.SinkRecord;
import org.apache.kafka.connect.sink.SinkTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eho.thor.db.mongo.MongoProcessor;
import com.eho.thor.json.FmblMessage;
import com.eho.thor.json.FmblMsgParser;

/**
 * FileStreamSinkTask writes records to stdout or a file.
 */
public class FmblSinkTask extends SinkTask {
	
    private static final Logger log = LoggerFactory.getLogger(FmblSinkTask.class);

    private String filename;
    
    private String fmblFolder;
    
    private PrintStream outputStream;

    private static int instanceCount;
    
    
    public FmblSinkTask() {
    	String msg =String.format(" built the instance count [%d]", instanceCount++);
    	log.warn(msg);
    }

// for testing
//    public FmblSinkTask(PrintStream outputStream) {
//        filename = null;
//        this.outputStream = outputStream;
//    }

    @Override
    public String version() {
        return new FmblSinkConnector().version();
    }

    @Override
    public void start(Map<String, String> props) {
        filename = props.get(FmblSinkConnector.FILE_CONFIG);
        fmblFolder = props.get(FmblSinkConnector.FMBL_FOLDER);
        
        if (filename == null) {
            outputStream = System.out;
        } 
        else 
        {
            try {
                OutputStream fileOutputStream = Files.newOutputStream(Paths.get(filename), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
				outputStream = new PrintStream( fileOutputStream, false, StandardCharsets.UTF_8.name());
            } 
            catch (IOException e) {
                throw new ConnectException("Couldn't find or create file '" + filename + "' for FileStreamSinkTask", e);
            }
        }
    }

    @Override
    public void put(Collection<SinkRecord> sinkRecords) {
    	
        for (SinkRecord record : sinkRecords) {        	
                       	
        	String recordContent = record.value().toString();
            log.warn("Writing line to {}: {}", logFilename(), record.value());            
            outputStream.println(record.value());
            
            try {
               FmblMessage fmblMessage = FmblMsgParser.getInstance().parseMessage(recordContent);
               
               if( fmblMessage != null ) {
                   String fmblFileFullName = FmblFileProcessor.saveFmblToFile(fmblMessage, fmblFolder);            	   
            	   MongoProcessor.getInstance().writeToDB( fmblMessage, fmblFileFullName );
            	   log.warn("--- one message was successfully saved into database ---");
               }
               
            }
            catch(Exception exp ) {
               log.error(exp.getLocalizedMessage());
            }
        }
    }

    @Override
    public void flush(Map<TopicPartition, OffsetAndMetadata> offsets) {
        log.trace("Flushing output stream for {}", logFilename());
        outputStream.flush();
    }

    @Override
    public void stop() {
        if (outputStream != null && outputStream != System.out)
            outputStream.close();
    }

    private String logFilename() {
        return filename == null ? "stdout" : filename;
    }
    
}
