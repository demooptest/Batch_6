package com.itsteps.abstraction;

import java.util.List;

public class Example2 {

	private String company;
	private List<Employees> employees;
	private List<Departments> departments;

	// inner class for employee_details list
	private static class Employees {

		private int id;
		private String name;
		private String department;
		private String position;
		private List<Projects> projects;

	}// Employees class

	// inner class for project_details list
	private static class Projects {

		private int id;
		private String name;
		private String description;

	}// projects class

	// inner class for department_details list
	private static class Departments {

		private String name;
		private String head;
		private String location;

	}// departments class

}