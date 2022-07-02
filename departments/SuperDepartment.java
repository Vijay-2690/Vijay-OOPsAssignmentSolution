package com.greatlearning.corejava.departments;

public class SuperDepartment {
	// public method to return Department Name
	public String departmentName() {
		
		String dept = "Super Department";
		
		return dept;
	}
	
	// public method to return Today's Work
	public String getTodaysWork() {
		
		String todayWork = "No Work as of now";
		
		return todayWork;
	}
	
	// public method to return the deadline of the Work
	public String getWorkDeadline() {
		
		String deadline = "NIL";
		
		return deadline;
	}
	
	//public method to return the holiday status
	public static String isTodayAHoliday() {
		
		String holidayStatus = "Today is not a holiday";
		
		return holidayStatus;
	}
}
