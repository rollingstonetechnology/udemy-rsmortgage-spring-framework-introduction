package com.rollingstone.springframework.aop.example.fifth;

public interface AirportOperations {

	public void checkin(Traveller t) throws AirportOperationxException;

	public void getBoradingPass(Traveller t) throws AirportOperationxException;

	public void checkInLuggage(Traveller t) throws AirportOperationxException;

	public void goForSecurityCheck(Traveller t) throws AirportOperationxException;

	public void deplane(Traveller t) throws AirportOperationxException;

	public void collectHandLuggage(Traveller t) throws AirportOperationxException;

	public void collecCheckInLuggage(Traveller t) throws AirportOperationxException;

	public void goThroughImmigrationAndCustomsCheck(Traveller t) throws AirportOperationxException;

	public void reprintBoardingPAss(Traveller t) throws AirportOperationxException;

}
