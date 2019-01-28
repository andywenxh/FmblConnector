package com.eho.thor.db;

import com.eho.thor.json.FmblMessage;

public interface DBProcessor {

    void writeToDB(FmblMessage fmblMessage, String fmblFullName) throws Exception;
	
}
