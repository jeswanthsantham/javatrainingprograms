package com.oops.inher;

public class InhertanceMain {
	
	public static void main(String[] args) {
		InEmployee employee= new InEmployee("Raju",10);
		employee.getDetails();
		
		InManager manager = new InManager("Priya",20,2000);
		manager.getDetails();
	}

}
