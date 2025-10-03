package com.oops.abs;

public class Client {
	public static void main(String[] args) {
		System.out.println("from Webcourses..");
		CourseDetails courseDetails = new WebCourses();
		String[] courses=courseDetails.showCourses();
		for (String course : courses) {
			System.out.println(course);
		}
		courseDetails.certificationsAllowed();
		System.out.println("from Webcourses own methods..");
		WebCourses web =(WebCourses)courseDetails;
		web.showProjects();
		System.out.println("from JavaStack.....");
		courseDetails = new JavaStack();
		courseDetails.showCourses();
		courseDetails.certificationsAllowed();
		System.out.println("from JavaStack own methods..");
		JavaStack jfs = (JavaStack)courseDetails;
		jfs.printDetails();
		jfs.courseTypes();
		System.out.println("from intermediate full stack courses......");
		FullStackCourses ref= jfs;
		ref.courseTypes();
		
		
		
		
		
		
		
		
	}
	

}
