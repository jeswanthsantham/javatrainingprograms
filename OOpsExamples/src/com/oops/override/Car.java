package com.oops.override;

public class Car extends Vehicle {
	

	public Car(String model, String brand) {
		super(model, brand);
	}

	@Override
	void getmileage() {
		System.out.println("Excellent Mileage for car");
	}
	
	void showAcc() {
		System.out.println("Seat cover, car Cover" );
	}
	
}
