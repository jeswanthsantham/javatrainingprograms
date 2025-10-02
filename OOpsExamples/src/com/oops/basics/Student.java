package com.oops.basics;

public class Student {
	String studentName;
	String department;
	
	Student(String studentName, String department){
		this.studentName = studentName;
		this.department = department;
	}
	
	void getDetails() {
		System.out.println("Student name "+ studentName);
		System.out.println("Department "+ department);
		
		
	}

}
