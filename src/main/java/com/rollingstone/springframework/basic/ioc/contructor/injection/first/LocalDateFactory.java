package com.rollingstone.springframework.basic.ioc.contructor.injection.first;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateFactory {
    
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
    public static LocalDate createLocalDate(String localDateString) 
    {
    	LocalDate localDate = LocalDate.parse(localDateString);
    	
    	return localDate;
    }
}