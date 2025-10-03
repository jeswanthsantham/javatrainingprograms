package com.oops.override;

public class Vehicle {
	String model;
	String brand;
	
	public Vehicle(String model, String brand) {
		super();
		this.model = model;
		this.brand = brand;
	}

	void getmileage() {
		System.out.println("good Mileage");
	}

}
