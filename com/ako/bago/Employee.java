package com.ako.bago;

public class Employee {

	private String name;
	private String address;
	private double salary;
	private String job_title;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public Employee(String name, String address, double salary, String job_title) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.job_title = job_title;
	}

	public double bonus() {
		return salary / 12;
	}

	public void getPerformanceReport() {
		 System.out.println("Performance report for " + name + ":");
	}
	public void getProjects(String x, String y, String z) {
		
		String project_1 = x;
		String project_2 = y;
		String project_3 = z;
		System.out.println(name + " manages projects such as: ");
		System.out.println("1: " + project_1);
		System.out.println("2: " + project_2 );
		System.out.println("3: " + project_3);
	}
}
