package com.rollingstone.springframework.aop.example.fifth;

import java.time.LocalDate;

public class FlightAttendant {

	private long flightAttendantID;
	
	private String flightAttendantCode;
	
	private String firstName;
	
	private String lastName;
	
	private String middleName;
	
	private String socialSecurityNumber;
	
	private LocalDate dateOfBirth;
	
		
	private int age;
	
	private String sex;

	public long getFlightAttendantID() {
		return flightAttendantID;
	}

	public void setFlightAttendantID(long flightAttendantID) {
		this.flightAttendantID = flightAttendantID;
	}

	public String getFlightAttendantCode() {
		return flightAttendantCode;
	}

	public void setFlightAttendantCode(String flightAttendantCode) {
		this.flightAttendantCode = flightAttendantCode;
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

	public FlightAttendant(long flightAttendantID, String flightAttendantCode, String firstName, String lastName,
			String middleName, String socialSecurityNumber, LocalDate dateOfBirth,  int age, String sex) {
		super();
		this.flightAttendantID = flightAttendantID;
		this.flightAttendantCode = flightAttendantCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.sex = sex;
	}

	public FlightAttendant() {
		super();
	}

	@Override
	public String toString() {
		return "FlightAttendant [flightAttendantID=" + flightAttendantID + ", flightAttendantCode="
				+ flightAttendantCode + ", firstName=" + firstName + ", lastName=" + lastName + ", middleName="
				+ middleName + ", socialSecurityNumber=" + socialSecurityNumber + ", dateOfBirth=" + dateOfBirth
				+ ", age=" + age + ", sex=" + sex + "]";
	}



}
