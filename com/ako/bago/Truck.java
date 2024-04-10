package com.ako.bago;

public class Truck extends Vehicle {

	public Truck(String make, String model, int year, String fuel_type) {
		super(make, model, year, fuel_type);
		// TODO Auto-generated constructor stub
	}

	private double distance_travel;
	double final_odometer = 480;
	double initial_odometer = 100;
	
	public double distance_travel() {
		distance_travel = final_odometer - initial_odometer;
		System.out.println("The total distance travel is: " 
		+ distance_travel);
		return distance_travel;
	}

	public void fuel_efficiency() {
		distance_travel = distance_travel();
		double fuel_consumed = 80;
		double fuel_eff = distance_travel / fuel_consumed;
		System.out.println("The fuel efficiency of a Truck is: " 
		+ fuel_eff);
	}
	public double max_speed() {
		return 200;
	}
	

}
