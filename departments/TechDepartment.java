package com.greatlearning.corejava.departments;

public class TechDepartment extends SuperDepartment{
	//method to return the Department Name

	public String departmentName() {

		String dept = "Tech Department";
		
		return dept;
	}
	
	// public method to return Today's Work
	public String getTodaysWork() {
		
		String todayWork = "Complete coding of Module 1";
		
		return todayWork;
	}
	
	// public method to return the deadline of the Work
	public String getWorkDeadline() {
		
		String deadline = "Complete by EOD";
		
		return deadline;
	}
	
	//public method to return Stack Information
	
	public String getTechStackInformation() {
		
		String stackInfo = "Core Java";
		
		return stackInfo;
	}
}
