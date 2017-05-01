package com.rollingstone.springframework.aop.example.fifth;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Flight {

	private long flightID;
	
	private String flightCode;
	
	private Airport fromAirport;
	
	private Airport destinationAirport;
	
	private LocalDateTime departureTime;
	
	private LocalDateTime arrivalTime;
	
	Airplane airplane;
	
	private List<Pilot> pilots = new ArrayList<Pilot>();
	
	private List<FlightAttendant> flightAttendants = new ArrayList<FlightAttendant>();
	
	private List<Traveller> passengers = new ArrayList<Traveller>();

	public long getFlightID() {
		return flightID;
	}

	public void setFlightID(long flightID) {
		this.flightID = flightID;
	}

	public String getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

	public Airport getFromAirport() {
		return fromAirport;
	}

	public void setFromAirport(Airport fromAirport) {
		this.fromAirport = fromAirport;
	}

	public Airport getDestinationAirport() {
		return destinationAirport;
	}

	public void setDestinationAirport(Airport destinationAirport) {
		this.destinationAirport = destinationAirport;
	}

	public LocalDateTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}

	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public List<Pilot> getPilots() {
		return pilots;
	}

	public void setPilots(List<Pilot> pilots) {
		this.pilots = pilots;
	}

	

	public Airplane getAirplane() {
		return airplane;
	}

	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}

	public List<FlightAttendant> getFlightAttendants() {
		return flightAttendants;
	}

	public void setFlightAttendants(List<FlightAttendant> flightAttendants) {
		this.flightAttendants = flightAttendants;
	}

	public List<Traveller> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Traveller> passengers) {
		this.passengers = passengers;
	}

	public Flight(long flightID, String flightCode, Airport fromAirport, Airport destinationAirport,
			LocalDateTime departureTime, LocalDateTime arrivalTime, Airplane airplane, List<Pilot> pilots,
			List<FlightAttendant> flightAttendants) {
		super();
		this.flightID = flightID;
		this.flightCode = flightCode;
		this.fromAirport = fromAirport;
		this.destinationAirport = destinationAirport;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.airplane = airplane;
		this.pilots = pilots;
		this.flightAttendants = flightAttendants;
	}

	@Override
	public String toString() {
		return "Flight [flightID=" + flightID + ", flightCode=" + flightCode + ", fromAirport=" + fromAirport
				+ ", destinationAirport=" + destinationAirport + ", departureTime=" + departureTime + ", arrivalTime="
				+ arrivalTime + ", pilots=" + pilots + ", flightAttendants=" + flightAttendants + "]";
	}

	public Flight() {
		super();
	}
	
	
	
}
