package com.training.question2;

public class Customer {

	public static void main(String[] args) {
		PaymentOptions payment=new PaymentOptions();
		payment.pay(5000);
		payment.pay("Star@ybl", 1500);
		payment.pay(23456789, 123, 2500);
		payment.pay("Central", "Ramu", 3000);
		
		

	}

}
