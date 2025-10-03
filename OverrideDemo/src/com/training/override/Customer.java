package com.training.override;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter O for TeamOne and T for TeamTwo");
		String choice = sc.next();
		TeamLead teamlead = null;
		if (choice.toUpperCase().equals("O")) {
			teamlead = new GroupOne("Citi", 12, "Ramu");
			teamlead.projectsAssigned();
			GroupOne groupone= (GroupOne)teamlead;
			groupone.projectsAssigned();
			String[] tools=groupone.showTools();
			for (String tool : tools) {
				System.out.println(tool);
				
			}
		} else {
			teamlead = new GroupTwo("UHG", 24, "Somu");
			teamlead.projectsAssigned();
			GroupTwo grouptwo = (GroupTwo)teamlead;
			grouptwo.projectsAssigned();
			grouptwo.coursesAssigned("Java", "Spring","sql");
		}

    sc.close();
	}

}
