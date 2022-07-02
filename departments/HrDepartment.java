package com.greatlearning.corejava.departments;

public class HrDepartment extends SuperDepartment{
	//method to return the Department Name
	
		public String departmentName() {
			
			String dept = "HR Department";
			
			return dept;
		}
		
		// public method to return Today's Work
		public String getTodaysWork() {
			
			String todayWork = "Fill today's worksheet and mark your attendance";
			
			return todayWork;
		}
		
		// public method to return the deadline of the Work
		public String getWorkDeadline() {
			
			String deadline = "Complete by EOD";
			
			return deadline;
		}
		
		//method to return the activity to do
		public String doActivity() {
			
			String activity = "Team Lunch";
			
			return activity;
		}
}
