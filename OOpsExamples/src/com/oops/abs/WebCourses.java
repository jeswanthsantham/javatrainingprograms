package com.oops.abs;

public class WebCourses extends CourseDetails {

	@Override
	String[] showCourses() {
		return new String[] {"HTML", "CSS","JS"};
	}
	void showProjects() {
		System.out.println("static pages");
		System.out.println("Contact forms");
	}

}
