package com.ako.bago;

public class Developer extends Employee {

	private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Developer(String name, String address, double salary, String job_title, String department) {
		super(name, address, salary, job_title);
		this.department = department;
	}

	public void generatePerformanceReport() {
		System.out.println(
				"Performance report on the Developer, " + getName() + " in " + department + " department: Excellent");
	}

	public void manageProjects(String a, String b, String c) {
		String project_1 = a;
		String project_2 = b;
		String project_3 = c;
		System.out.println(getName() + " manages projects such as: ");
		System.out.println("1: " + project_1);
		System.out.println("2: " + project_2);
		System.out.println("3: " + project_3);
	}

}
