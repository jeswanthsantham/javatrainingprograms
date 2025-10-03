package com.training.question1;

public class MobileMain {

	public static void main(String[] args) {
		Mobile mobile1 = new Mobile("S23", 2000, "Samsung");
		Mobile mobile2 = new Mobile("15 pro", 35000, "Iphone");
		
		mobile1.getDetails();
		mobile2.getDetails();
		
		String[] featuresList = mobile1.showFeatures();
		for (String string : featuresList) {
			System.out.println(string);
			
		}

	}

}
