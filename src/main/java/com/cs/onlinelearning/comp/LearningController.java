package com.cs.onlinelearning.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LearningController {
	
	@Autowired
	private JavaCourse javaCourse;
	
	@Autowired
	private PythonCourse pythonCourse;
	
	@Autowired
	private DataScienceCourse dataScienceCourse;
	
	  public void displayWelcomeMessage() {
	        System.out.println("\u001B[34m");
	        System.out.println("🎓 Welcome to Online Learning Courses");
	        System.out.println("==========================================");
	        System.out.println("\u001B[0m");
	    }
	
	public void enrollJavaCourse() {
		System.out.println("\u001B[30m===== Course Enrollment =====");
		System.out.println("\u001B[32m"+"Enrolled in:: "+javaCourse.getCourseName());
		System.out.println("\u001B[32m"+"Delivered via:: "+javaCourse.getDeliveryMode());
		System.out.println("---------------------------------------");
	}
	
	public void enrollPythonCourse(){
		System.out.println("\u001B[30m===== Course Enrollment =====");
		System.out.println("\u001B[32m"+"Enrolled in:: "+pythonCourse.getCourseName());
		System.out.println("\u001B[32m"+"Delivered via:: "+pythonCourse.getDeliveryMode());
		System.out.println("---------------------------------------");
	}
	
	public void enrollDataScienceCourse(){
		System.out.println("\u001B[30m===== Course Enrollment =====");
		System.out.println("\u001B[32m"+"Enrolled in:: "+dataScienceCourse.getCourseName());
		System.out.println("\u001B[32m"+"Delivered via:: "+dataScienceCourse.getDeliveryMode());
		System.out.println("---------------------------------------");
	}
	
	 public void displayClosingMessage() {
	        System.out.println("\u001B[34m\"🏁 Thank you for learning with us!");
	        System.out.println("Keep exploring, keep growing! 🌱");
	    }
}
