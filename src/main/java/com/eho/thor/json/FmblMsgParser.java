package com.eho.thor.json;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FmblMsgParser {

	private static final ObjectMapper mapper = new ObjectMapper();

	private static FmblMsgParser instance = new FmblMsgParser();

	private FmblMsgParser() {

	}

	public static FmblMsgParser getInstance() {
		return instance;
	}

	public FmblMessage parseMessage(String content) {
		FmblMessage msg = null;

		try {
			msg = mapper.readValue(content, FmblMessage.class);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

		return msg;
	}

}
