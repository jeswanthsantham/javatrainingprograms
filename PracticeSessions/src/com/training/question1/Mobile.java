package com.training.question1;

import java.util.Objects;

public class Mobile {
	String model;
	double price;
	String brand;
	public Mobile(String model) {
		super();
		this.model = model;
	}
	public Mobile(String model, double price) {
		super();
		this.model = model;
		this.price = price;
	}
	public Mobile(String model, double price, String brand) {
		super();
		this.model = model;
		this.price = price;
		this.brand = brand;
	}
	
	void getDetails() {
		System.out.println("Model "+model +" "+"Price "+price +" "+"Brand "+brand);
	}
	
	String[] showFeatures() {
		return new String []{"good Camera", "Sensors", "Speakers"};
		
	}
	
	

}
