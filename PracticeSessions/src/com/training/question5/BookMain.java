package com.training.question5;

public class BookMain {

	public static void main(String[] args) {
		Book book1 = new Book("Java", "James", 750);
		Book book2 = new Book("Maths", "Golden");
		Book book3 = new Book("Physics");
		Book book4 = new Book();
		
		book1.printDetails();
		book2.printDetails();
		book3.printDetails();
		book4.printDetails();
		
		

	}

}
