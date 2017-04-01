package com.rollingstone.springframework.aop.example.fifth;

import java.time.LocalDate;

public class Pilot {

private long pilotID;
	
	private String firstName;
	
	private String lastName;
	
	private String middleName;
	
	private String socialSecurityNumber;
	
	private LocalDate dateOfBirth;
	
	
	private int age;
	
	private String sex;
	
	private int flyingHours;

	public long getPilotID() {
		return pilotID;
	}

	public void setPilotID(long pilotID) {
		this.pilotID = pilotID;
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

	public int getFlyingHours() {
		return flyingHours;
	}

	public void setFlyingHours(int flyingHours) {
		this.flyingHours = flyingHours;
	}

	public Pilot(long pilotID, String firstName, String lastName, String middleName, String socialSecurityNumber,
			LocalDate dateOfBirth,  int age,
			String sex, int flyingHours) {
		super();
		this.pilotID = pilotID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.sex = sex;
		this.flyingHours = flyingHours;
	}

	public Pilot() {
		super();
	}

	@Override
	public String toString() {
		return "Pilot [pilotID=" + pilotID + ", firstName=" + firstName + ", lastName=" + lastName + ", middleName="
				+ middleName + ", socialSecurityNumber=" + socialSecurityNumber + ", dateOfBirth=" + dateOfBirth
				+ ", age=" + age + ", sex=" + sex + ", flyingHours=" + flyingHours + "]";
	}
	
	
}
