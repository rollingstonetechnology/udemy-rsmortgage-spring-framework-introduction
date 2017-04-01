package com.rollingstone.springframework.basic.ioc.contructor.injection.first;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeFactory {
    
	
    public static LocalDateTime createLocalDateTime(String localDateTimeString) 
    {
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    	
    	LocalDateTime dateTime = LocalDateTime.parse(localDateTimeString, formatter);
    	
    	return dateTime;

    }
}
