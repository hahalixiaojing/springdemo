package com.demo.application.util;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class CustomDateSerializer extends JsonSerializer<LocalDateTime> {

	@Override
	public void serialize(LocalDateTime arg0, JsonGenerator arg1,
			SerializerProvider arg2) throws IOException,
			JsonProcessingException {
		
		String formatter = arg0.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		
		arg1.writeString(formatter);
		
	}

}
