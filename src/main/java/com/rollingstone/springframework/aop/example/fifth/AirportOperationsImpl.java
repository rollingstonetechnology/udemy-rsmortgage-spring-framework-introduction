package com.rollingstone.springframework.aop.example.fifth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AirportOperationsImpl implements AirportOperations {

	private static final Logger logger = LoggerFactory.getLogger(AirportOperationsImpl.class);
	
	public void checkin(Traveller t) {
			logger.info("Checking via online or at the Airport counter " + t.getFirstName() + " "  + t.getLastName() + " ID : "+ t.getTravellerID());
	}

	public void getBoradingPass(Traveller t) {
		logger.info("Receive boarding pass and keep it with passports "+ t.getFirstName() + " "  + t.getLastName() + " ID : "+ t.getTravellerID());
	}

	public void checkInLuggage(Traveller t) {
		logger.info("Provide Suitcases for weight checking and if ok check them in. " + t.getFirstName() + " "  + t.getLastName() + " ID : "+ t.getTravellerID());
	}

	public void goForSecurityCheck(Traveller t) {
		logger.info("Stand in Queue for the security check. " +  t.getFirstName() + " "  + t.getLastName() + " ID : "+ t.getTravellerID());
	}

	public void deplane(Traveller t) {
		logger.info("Stand in Queue to get off from the plane. " + t.getFirstName() + " "  + t.getLastName() + " ID : "+ t.getTravellerID());
	}

	public void collectHandLuggage(Traveller t) {
		logger.info("Take hand luggage with you. " +  t.getFirstName() + " "  + t.getLastName() + " ID : "+ t.getTravellerID());
	}

	public void collecCheckInLuggage(Traveller t) {
		logger.info("Find luggage carusel and collect checked in luggage. " + t.getFirstName() + " "  + t.getLastName() + " ID : "+ t.getTravellerID());
	}

	public void goThroughImmigrationAndCustomsCheck(Traveller t) throws AirportOperationxException {
		logger.info("PResent passport and other documents for immigration check. " + t.getFirstName() + " "  + t.getLastName() + " ID : "+ t.getTravellerID());
		
		if (t.getTravellerID() == 15){
			throw new AirportOperationxException("Expired Visa");
		}
	}

	public void reprintBoardingPAss(Traveller t) {
		logger.info("Enter ticket information to reprint." + t.getFirstName());
	}

	

}
