package com.training.question3;

public class Product {
	void itemsAvailable(String... itemsNames) {
		for (String item : itemsNames) {
			System.out.println(item);
		}
	}

	void showReviews(String itemName, String... reviews) {
		System.out.println("Reviews for "+itemName);
		for (String review : reviews) {
			System.out.print(review +" "+",");

		}
	}

}
