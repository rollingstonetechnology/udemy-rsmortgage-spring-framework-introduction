package com.rollingstone.springframework.basic.ioc.setter.injection.third;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerWithAddress {

	private long customerId;
	private String firstName;
	private String lastName;
	private LocalDate dob;
	
	private Address address;
	
	private List<String> phoneNumbers = new ArrayList<String>();
	
	private List<Education> degrees = new ArrayList<Education>();
	
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	
	//TODO Commend the getter and setter for degrees
	public List<Education> getDegrees() {
		return degrees;
	}
	public void setDegrees(List<Education> degrees) {
		this.degrees = degrees;
	}
	
	public CustomerWithAddress(long customerId, String firstName, String lastName, LocalDate dob) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}
	public CustomerWithAddress() {
		super();
	}
	@Override
	public String toString() {
		return "CustomerWithAddress [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dob=" + dob + ", address=" + address + ", phoneNumbers=" + phoneNumbers + ", degrees=" + degrees
				+ "]";
	}
	
	
}
