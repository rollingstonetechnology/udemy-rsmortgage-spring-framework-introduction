package com.rollingstone.springframework.basic.ioc.contructor.injection.collection.second;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

public class CarOwnerWithMapObjects {

	private long ownerId;
	private String firstName;
	private String lastName;
	private LocalDate dob;
	
	private Map<String,Car> cars;  
	
	public long getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
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
	public CarOwnerWithMapObjects(long ownerId, String firstName, String lastName, LocalDate dob) {
		super();
		this.ownerId = ownerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}
	public CarOwnerWithMapObjects() {
		super();
	}
	@Override
	public String toString() {
		return "CarOwner [ownerId=" + ownerId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", cars=" + cars + "]";
	}
	public CarOwnerWithMapObjects(long ownerId, String firstName, String lastName, LocalDate dob,
			Map<String, Car> cars) {
		super();
		this.ownerId = ownerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.cars = cars;
	}
	
	
}
