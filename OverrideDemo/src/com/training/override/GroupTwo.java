package com.training.override;

public class GroupTwo extends TeamLead {
	
	

	public GroupTwo(String clientName, int duration, String tlName) {
		super(clientName, duration, tlName);
		// TODO Auto-generated constructor stub
	}

	@Override
	void projectsAssigned() {
		System.out.println("GroupTwo Projects");
	}
	
	void coursesAssigned(String... courses) {
		for (String course : courses) {
			System.out.println(course);
			
		}
	}

}
