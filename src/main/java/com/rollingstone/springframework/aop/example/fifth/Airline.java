package com.rollingstone.springframework.aop.example.fifth;

import java.time.LocalDate;

public class Airline {

	private long airlineID;
	
	private String airlineCode;
	
	private String airlineName;
	
	private LocalDate startedOperation;
	
	private String centralHub;

	public long getAirlineID() {
		return airlineID;
	}

	public void setAirlineID(long airlineID) {
		this.airlineID = airlineID;
	}

	public String getAirlineCode() {
		return airlineCode;
	}

	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public LocalDate getStartedOperation() {
		return startedOperation;
	}

	public void setStartedOperation(LocalDate startedOperation) {
		this.startedOperation = startedOperation;
	}

	public String getCentralHub() {
		return centralHub;
	}

	public void setCentralHub(String centralHub) {
		this.centralHub = centralHub;
	}

	public Airline(long airlineID, String airlineCode, String airlineName, LocalDate startedOperation,
			String centralHub) {
		super();
		this.airlineID = airlineID;
		this.airlineCode = airlineCode;
		this.airlineName = airlineName;
		this.startedOperation = startedOperation;
		this.centralHub = centralHub;
	}

	public Airline() {
		super();
	}
	
	
}
