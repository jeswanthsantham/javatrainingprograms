package com.oops.override;

public class Bike extends Vehicle {
	

	public Bike(String model, String brand) {
		super(model, brand);
	}

	@Override
	void getmileage() {
		System.out.println("Okish Mileage for Bike");
	}
	
	void printType() {
		System.out.println("Sports Bike");
	}
	
}
