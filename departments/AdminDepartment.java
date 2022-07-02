package com.greatlearning.corejava.departments;

public class AdminDepartment extends SuperDepartment{

	//method to return the Department Name
	
	public String departmentName() {
		
		String dept = "Admin Department";
		
		return dept;
	}
	
	// public method to return Today's Work
	public String getTodaysWork() {
		
		String todayWork = "Complete your documents Submission";
		
		return todayWork;
	}
	
	// public method to return the deadline of the Work
	public String getWorkDeadline() {
		
		String deadline = "Complete by EOD";
		
		return deadline;
	} 
}
