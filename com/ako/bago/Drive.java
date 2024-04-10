package com.ako.bago;

public class Drive {

	public static void main(String[] args) {
		Car car = new Car("Toyota", "Camry", 2020, "Petrol");
		Truck truck = new Truck("Ford", "F-Series", 2019, "Petrol");
		Motorcycle mc = new Motorcycle("Honda", "CBR600RR", 2018, "Petrol");

		System.out.println("CAR DETAILS: ");
		System.out.println("The car is made out of " + car.getMake());
		System.out.println("The car model is " + car.getModel());
		System.out.println("The car is made out on the year " + car.getYear());
		System.out.println("The car has a fuel type of " + car.getFuel_type());
		car.fuel_efficiency();
		car.distance_travel();
		System.out.println("The car has a maximum speed of " + car.max_speed());

		System.out.println();

		System.out.println("TRUCK DETAILS: ");
		System.out.println("The truck is made out of " + truck.getMake());
		System.out.println("The truck model is " + truck.getModel());
		System.out.println("The truck is made out on the year " + truck.getYear());
		System.out.println("The truck is made out on the year " + truck.getFuel_type());
		truck.fuel_efficiency();
		truck.distance_travel();
		System.out.println("The truck is made out on the year " + truck.max_speed());

		System.out.println();

		System.out.println("MOTORCYCLE DETAILS: ");
		System.out.println("The motorcycle is made out of " + mc.getMake());
		System.out.println("The motorcycle model is " + mc.getModel());
		System.out.println("The motorcycle is made out on the year " + mc.getYear());
		System.out.println("The motorcycle is made out on the year " + mc.getFuel_type());
		mc.fuel_efficiency();
		mc.distance_travel();
		System.out.println("The motorcycle is made out on the year " + mc.max_speed());
	}

}
