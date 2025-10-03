package com.oops.abs;

public abstract class CourseDetails {
	abstract String[]showCourses();
	
	void certificationsAllowed()
	{
		System.out.println("Java");
		System.out.println("Cloud");
		instituteDetails();
	}
	
	private void instituteDetails() {
		System.out.println("Bengalore");
	}
}
