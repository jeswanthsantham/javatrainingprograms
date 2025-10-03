package com.training.override;

public class GroupOne extends TeamLead {
	

	public GroupOne(String clientName, int duration, String tlName) {
		super(clientName, duration, tlName);
		// TODO Auto-generated constructor stub
	}
	@Override
	void projectsAssigned() {
		System.out.println("GroupOne Projects");
	}
	String[] showTools() {
		return new String[] {"Postman", "Docker", "Git"};
	}

}
