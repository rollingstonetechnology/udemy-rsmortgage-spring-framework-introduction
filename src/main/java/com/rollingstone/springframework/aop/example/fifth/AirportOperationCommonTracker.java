package com.rollingstone.springframework.aop.example.fifth;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class AirportOperationCommonTracker {

	private static final Logger logger = LoggerFactory.getLogger(AirportOperationCommonTracker.class);
	
	//@Before("execution(* com.rollingstone.springframework.aop.example.Traveller.goForSecurityCheck(..))")
	@Before("execution(* com.rollingstone.springframework.aop.example.fifth.AirportOperations.goForSecurityCheck(..))")
	public void performSecurityCheckForTraveller(JoinPoint joinPoint){
		logger.info("AOP!!!!!!!!!!!! :- Check Passenger for security clearance!");
	}
	
//	@Before("execution(* com.rollingstone.springframework.aop.example.Traveller.checkInLuggage(..))")
	@Before("execution(* com.rollingstone.springframework.aop.example.fifth.AirportOperations.checkInLuggage(..))")
	public void performSecurityCheckforBaggage(JoinPoint joinPoint){
		logger.info("AOP!!!!!!!!!!!! :- Check Passenger's luggage for security clearance!");

	}
	
//	@Before("execution(* com.rollingstone.springframework.aop.example.Traveller.goForSecurityCheck(..))")
	@Before("execution(* com.rollingstone.springframework.aop.example.fifth.AirportOperations.goForSecurityCheck(..))")
	public void performSecurityCheckforHandBaggage(JoinPoint joinPoint){
		logger.info("AOP!!!!!!!!!!!! :- Check Passenger's hand luggage for security clearance!");

	}
	
	
	@AfterReturning(
		      pointcut = "execution(* com.rollingstone.springframework.aop.example.fifth.AirportOperations.goThroughImmigrationAndCustomsCheck(..))",
		      returning= "result")
	public void performImmigrationCheck(JoinPoint jp,Object result){
		
		logger.info("Airport Function : " + jp.getSignature().getName());
		logger.info("AOP!!!!!!!!!!!! :- Check Passenger's Passport and Visa and / or Permanent Resident Card!");
	
		
		if (result != null){
			logger.info("Welcome to the country :"+result.toString());
		}
	}
	
	@AfterReturning(
		      pointcut = "execution(* com.rollingstone.springframework.aop.example.fifth.AirportOperations.goThroughImmigrationAndCustomsCheck(..))",
		      returning= "result")
	public void performCustomsCheckforBaggage(JoinPoint jp,Object result){
		logger.info("Airport Function : " + jp.getSignature().getName());

		logger.info("AOP!!!!!!!!!!!! :- Check Passenger's Luggage for customs clearance!");
		if (result != null){
			logger.info("Your luggage is all clear :"+result.toString());
		}
	}
	
	@AfterThrowing(
		      pointcut = "execution(* com.rollingstone.springframework.aop.example.fifth.AirportOperations.AirportOperationxException(..))",
		      throwing= "error")
		    public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {

			System.out.println("logAfterThrowing() is running!");
			System.out.println("Airport Operation fone wrong : " + joinPoint.getSignature().getName());
			System.out.println("Exception : " + error);
			System.out.println("******");

		    }
	
	/*@Before("execution(* com.rollingstone.springframework.aop.example.AirportOperationsImpl.checkin(..))")
	public void assistedCheckin(){
		
	}*/
	
	/*@Before("execution(* com.rollingstone.springframework.aop.example.AirportOperationsImpl.reprintBoardingPAss(..))")
	public void reprintBoardingPass(){
		
	}*/
	
	public void refuelPlanes(){
		
	}
	
	public void protectAirport(){
		
	}
	
	public void displayFlightInformation(){
		
	}
	
	
}
