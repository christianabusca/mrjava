package com.ako.bago;

public class Vehicle {

	private String make;
	private String model;
	private int year;
	private String fuel_type;
	
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	public String getFuel_type() {
		return fuel_type;
	}
	public Vehicle(String make, String model, int year, String fuel_type) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.fuel_type = fuel_type;
	}
	
	
	
}
