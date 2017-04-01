package com.rollingstone.springframework.aop.example.fifth;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rollingstone.springframework.basic.ioc.contructor.injection.first.TestSimpleSpringIOC;

public class Traveller {

	private static final Logger logger = LoggerFactory.getLogger(Traveller.class);

	private long travellerID;
	
	private String firstName;
	
	private String lastName;
	
	private String middleName;
	
	private String socialSecurityNumber;
	
	private LocalDate dateOfBirth;
	
	Airport travellingFrom;
	
	Airport travellingTo;
	
	private int age;
	
	private String sex;
	
	private String foodChoice;

	public long getTravellerID() {
		return travellerID;
	}

	public void setTravellerID(long travellerID) {
		this.travellerID = travellerID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Airport getTravellingFrom() {
		return travellingFrom;
	}

	public void setTravellingFrom(Airport travellingFrom) {
		this.travellingFrom = travellingFrom;
	}

	public Airport getTravellingTo() {
		return travellingTo;
	}

	public void setTravellingTo(Airport travellingTo) {
		this.travellingTo = travellingTo;
	}

	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getFoodChoice() {
		return foodChoice;
	}

	public void setFoodChoice(String foodChoice) {
		this.foodChoice = foodChoice;
	}

	

	public Traveller(long travellerID, String firstName, String lastName, String middleName,
			String socialSecurityNumber, LocalDate dateOfBirth, Airport travellingFrom, Airport travellingTo,
			int age, String sex, String foodChoice) {
		super();
		this.travellerID = travellerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.dateOfBirth = dateOfBirth;
		this.travellingFrom = travellingFrom;
		this.travellingTo = travellingTo;
		this.age = age;
		this.sex = sex;
		this.foodChoice = foodChoice;
	}

	public Traveller() {
		super();
	}

	@Override
	public String toString() {
		return "Traveller [travellerID=" + travellerID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", middleName=" + middleName + ", socialSecurityNumber=" + socialSecurityNumber + ", dateOfBirth="
				+ dateOfBirth + ", travellingFrom=" + travellingFrom + ", travellingTo=" + travellingTo
				+ ", age=" + age + ", sex=" + sex + ", foodChoice=" + foodChoice
				+ "]";
	}
	

}
