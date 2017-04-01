package com.rollingstone.springframework.basic.ioc.setter.injection.third;

public class Address {

	private long addressID;
	
	private String streetAddress;
	
	private String city;
	
	private String state;
	
	private String zipCode;

	public long getAddressID() {
		return addressID;
	}

	public void setAddressID(long addressID) {
		this.addressID = addressID;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Address(long addressID, String streetAddress, String city, String state, String zipCode) {
		super();
		this.addressID = addressID;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public Address() {
		super();
	}

	@Override
	public String toString() {
		return "Address [addressID=" + addressID + ", streetAddress=" + streetAddress + ", city=" + city + ", state="
				+ state + ", zipCode=" + zipCode + "]";
	}
	
	
}
