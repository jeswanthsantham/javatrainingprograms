package com.oops.override;

//import java.util.Scanner;

public class Showroom {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter c for car and b for Bike");
//		String choice = sc.next();
//		Vehicle vehicle = null;
//		
//		if(choice.toUpperCase().equals("C")){
//			vehicle=new Car();
//		}
//		else {
//			vehicle=new Bike();
//		}
//		vehicle.getmileage();
		
		Vehicle vehicle = new Car("Honda", "City");
		vehicle.getmileage();
		
		Car car = (Car)vehicle;
		car.showAcc();
		
		vehicle = new Bike("Scooty","Pept");
		vehicle.getmileage();
		
		Bike bike=(Bike)vehicle;
		bike.printType();
		
	}

}
