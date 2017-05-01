package com.rollingstone.springframework.aop.example.fifth;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class RunAirportOperation {


	
	private static final Logger logger = LoggerFactory.getLogger(RunAirportOperation.class);

	
	public static void main(String[] args) throws AirportOperationxException{
		
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-aop.xml");
		 
		  Traveller traveller01 = (Traveller) context.getBean("traveller01");
		  
		  AirportOperations airportOperations = (AirportOperations) context.getBean("airportOperations");
		  
		  try {
			airportOperations.checkin(traveller01);
		} catch (AirportOperationxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  try {
			airportOperations.goForSecurityCheck(traveller01);
		} catch (AirportOperationxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  airportOperations.checkInLuggage(traveller01);
		  
		  airportOperations.deplane(traveller01);
		  
		  airportOperations.collectHandLuggage(traveller01);
		  
		  airportOperations.collecCheckInLuggage(traveller01);
		  
		  airportOperations.goThroughImmigrationAndCustomsCheck(traveller01);
		  
		  
		  airportOperations.goThroughImmigrationAndCustomsCheck(traveller01);
		  
		  
		  List<Traveller> aiorport01Pasengers = (List<Traveller>) context.getBean("listOfTravellersinAireport01");

		  for (Traveller traveller : aiorport01Pasengers){
			  
			  logger.info("========================================================================");
			  logger.info("========================================================================");
			  logger.info("========================================================================");
			  airportOperations.checkin(traveller);
			  
			  airportOperations.goForSecurityCheck(traveller);
			  
			  airportOperations.checkInLuggage(traveller);
			  
			  airportOperations.deplane(traveller);
			  
			  airportOperations.collectHandLuggage(traveller);
			  
			  airportOperations.collecCheckInLuggage(traveller);
			  
			  airportOperations.goThroughImmigrationAndCustomsCheck(traveller);
			  
			  logger.info("========================================================================");
			  logger.info("========================================================================");
			  logger.info("========================================================================");

		  }
		  
		   aiorport01Pasengers = (List<Traveller>) context.getBean("listOfTravellersinAireport04");

		  for (Traveller traveller : aiorport01Pasengers){
			  
			  logger.info("========================================================================");
			  logger.info("========================================================================");
			  logger.info("========================================================================");
			  airportOperations.checkin(traveller);
			  
			  airportOperations.goForSecurityCheck(traveller);
			  
			  airportOperations.checkInLuggage(traveller);
			  
			  airportOperations.deplane(traveller);
			  
			  airportOperations.collectHandLuggage(traveller);
			  
			  airportOperations.collecCheckInLuggage(traveller);
			  
			  airportOperations.goThroughImmigrationAndCustomsCheck(traveller);
			  
			  logger.info("========================================================================");
			  logger.info("========================================================================");
			  logger.info("========================================================================");

		  }
		  
		  
		  
	        System.out.println(traveller01);
		 
		 
	}
}
