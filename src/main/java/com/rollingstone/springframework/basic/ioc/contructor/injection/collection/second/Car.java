package com.rollingstone.springframework.basic.ioc.contructor.injection.collection.second;

import java.time.LocalDate;

public class Car {

	private long carID;
	
	private int carYear;
	
	private String carModel;
	private String carMake;

	private String carColor;
	
	private LocalDate registrationRenewalDate;

	public long getCarID() {
		return carID;
	}

	public void setCarID(long carID) {
		this.carID = carID;
	}

	public int getCarYear() {
		return carYear;
	}

	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	

	@Override
	public String toString() {
		return "Car [carID=" + carID + ", carYear=" + carYear + ", carModel=" + carModel + ", carMake=" + carMake
				+ ", carColor=" + carColor + "]";
	}

	public Car(long carID, int carYear, String carModel, String carMake, String carColor,
			LocalDate registrationRenewalDate) {
		super();
		this.carID = carID;
		this.carYear = carYear;
		this.carModel = carModel;
		this.carMake = carMake;
		this.carColor = carColor;
		this.registrationRenewalDate = registrationRenewalDate;
	}

	public LocalDate getRegistrationRenewalDate() {
		return registrationRenewalDate;
	}

	public void setRegistrationRenewalDate(LocalDate registrationRenewalDate) {
		this.registrationRenewalDate = registrationRenewalDate;
	}

	public Car(long carID, int carYear, String carModel, String carMake, String carColor) {
		super();
		this.carID = carID;
		this.carYear = carYear;
		this.carModel = carModel;
		this.carMake = carMake;
		this.carColor = carColor;
	}
	
	
	
}
