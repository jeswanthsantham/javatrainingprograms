package com.training.override;

public class TeamLead {
	
	String clientName;
	int duration;
	String tlName;
	
	
	public TeamLead(String clientName, int duration, String tlName) {
		super();
		this.clientName = clientName;
		this.duration = duration;
		this.tlName = tlName;
	}


	void projectsAssigned() {
		System.out.println("AI Projects");
	}

}
