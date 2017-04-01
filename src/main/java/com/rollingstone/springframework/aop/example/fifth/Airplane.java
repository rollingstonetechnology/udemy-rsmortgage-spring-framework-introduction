package com.rollingstone.springframework.aop.example.fifth;

import java.time.LocalDate;

public class Airplane {

	private long planeID;
	
	private String planeType;
	
	private int numFlights;
	
	private LocalDate commissionDate;

	public long getPlaneID() {
		return planeID;
	}

	public void setPlaneID(long planeID) {
		this.planeID = planeID;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public int getNumFlights() {
		return numFlights;
	}

	public void setNumFlights(int numFlights) {
		this.numFlights = numFlights;
	}

	public LocalDate getCommissionDate() {
		return commissionDate;
	}

	public void setCommissionDate(LocalDate commissionDate) {
		this.commissionDate = commissionDate;
	}

	
	public Airplane(long planeID, int numFlights, LocalDate commissionDate) {
		super();
		this.planeID = planeID;
		this.numFlights = numFlights;
		this.commissionDate = commissionDate;
	}

	public Airplane() {
		super();
	}

	public Airplane(long planeID, String planeType, int numFlights, LocalDate commissionDate) {
		super();
		this.planeID = planeID;
		this.planeType = planeType;
		this.numFlights = numFlights;
		this.commissionDate = commissionDate;
	}

	@Override
	public String toString() {
		return "Airplane [planeID=" + planeID + ", planeType=" + planeType + ", numFlights=" + numFlights
				+ ", commissionDate=" + commissionDate + "]";
	}
	
	
}
