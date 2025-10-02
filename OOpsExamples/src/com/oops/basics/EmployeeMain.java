package com.oops.basics;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.employeeName = "sai";
		employee1.employeeId = 10;
		employee1.salary = 2000;
		
		employee1.getDetails();
//		System.out.println("Name " + employee1.employeeName);
//		System.out.println("Id " + employee1.employeeId);
//		System.out.println("Salary " + employee1.salary);

		Employee employee2 = new Employee();
		employee2.employeeName = "Ram";
		employee2.employeeId = 12;
		employee2.salary = 2500;
		
		employee2.getDetails();
		System.out.println(employee1.greet("Hello"));
		System.out.println(employee2.greet("Goodbye"));
		
//		System.out.println("Name " + employee2.employeeName);
//		System.out.println("Id " + employee2.employeeId);
//		System.out.println("Salary " + employee2.salary);

//		EmployeeMain employee3 = employee2;
//		System.out.println("emp3 name " + employee3.employeeName);
//		System.out.println("emp2 name " + employee2.employeeName);
//		// employee2=null;
//		System.out.println("emp3 name " + employee3.employeeName);
//		System.out.println("emp3 name " + employee2.employeeName);

	}

}
