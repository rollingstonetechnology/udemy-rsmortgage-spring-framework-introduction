package com.rollingstone.springframework.aop.example.fifth;

public class Airport {

	private long airportID;
	
	private String airportCode;
	
	private String airportName;
	
	private String country;
	
	private String city;
	
	private String address;

	public long getAirportID() {
		return airportID;
	}

	public void setAirportID(long airportID) {
		this.airportID = airportID;
	}

	public String getAirportCode() {
		return airportCode;
	}

	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Airport(long airportID, String airportCode, String airportName, String country, String city,
			String address) {
		super();
		this.airportID = airportID;
		this.airportCode = airportCode;
		this.airportName = airportName;
		this.country = country;
		this.city = city;
		this.address = address;
	}

	public Airport() {
		super();
	}

	@Override
	public String toString() {
		return "Airport [airportID=" + airportID + ", airportCode=" + airportCode + ", airportName=" + airportName
				+ ", country=" + country + ", city=" + city + ", address=" + address + "]";
	}
	
	
	
	
}
