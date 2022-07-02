package com.greatlearning.corejava.departments;

public class Driver{

	public static void main(String[] args) {
		
		// Creating object of Admin Department
		AdminDepartment admin = new AdminDepartment();
		
		//Creating object of HR Department
		HrDepartment hr = new HrDepartment();
		
		//Creating object of Tech Department
		TechDepartment tech = new TechDepartment();
		
		//Calling methods of Admin department and printing on console
		System.out.println("Welcome to " +  admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday() + "\n");
		System.out.println();
		
		//Calling methods of HR Department and printing on console
		System.out.println("Welcome to " +  hr.departmentName());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.doActivity());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();

		//Calling methods of Tech Department and printing on console
		System.out.println("Welcome to " +  tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
		System.out.println();
	}

}
