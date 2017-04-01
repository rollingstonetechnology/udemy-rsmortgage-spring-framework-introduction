package com.rollingstone.springframework.aop.example.fifth;

import java.time.LocalDate;

public class SecurityOfficer {

private long officeID;

private String officercode;

	
	private String firstName;
	
	private String lastName;
	
	private String middleName;
	
	private String socialSecurityNumber;
	
	private LocalDate dateOfBirth;
	
	Airport homeAirport;
	
	private int age;
	
	private String sex;

	public long getOfficeID() {
		return officeID;
	}

	public void setOfficeID(long officeID) {
		this.officeID = officeID;
	}

	public String getOfficercode() {
		return officercode;
	}

	public void setOfficercode(String officercode) {
		this.officercode = officercode;
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

	

	public SecurityOfficer() {
		super();
	}

	public Airport getHomeAirport() {
		return homeAirport;
	}

	public void setHomeAirport(Airport homeAirport) {
		this.homeAirport = homeAirport;
	}

	public SecurityOfficer(long officeID, String officercode, String firstName, String lastName, String middleName,
			String socialSecurityNumber, LocalDate dateOfBirth, Airport homeAirport, int age, String sex) {
		super();
		this.officeID = officeID;
		this.officercode = officercode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.dateOfBirth = dateOfBirth;
		this.homeAirport = homeAirport;
		this.age = age;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "SecurityOfficer [officeID=" + officeID + ", officercode=" + officercode + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", middleName=" + middleName + ", socialSecurityNumber="
				+ socialSecurityNumber + ", dateOfBirth=" + dateOfBirth + ", homeAirport=" + homeAirport + ", age="
				+ age + ", sex=" + sex + "]";
	}

	
	
	
}
