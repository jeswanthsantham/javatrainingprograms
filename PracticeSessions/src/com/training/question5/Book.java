package com.training.question5;

public class Book {
	String title;
	String author;
	double price;

	public Book() {

	}

	public Book(String title) {
		super();
		this.title = title;
	}

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;

	}

	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	void printDetails() {
		if (title==null && author==null && (price == 0)) {
			System.out.println("Empty");
		}
		else if (title!=null && author==null && (price == 0)) {
			System.out.println("Title :" + title);
		}
		 else if (!title.equals(null) && !author.equals(null) && (price == 0)) {
			System.out.println("Title :" + title + " " + "Author :" + author);
		} else if (!title.equals(null) && !author.equals(null) && (price != 0)) {
			System.out.println("Title :" + title + " " + "Author :" + author + " " + "Price :" + price);
		}

	}

}
