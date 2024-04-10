package com.ako.bago;

public class Programmer extends Employee {

	private String department;
	private String prog_lang;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getProg_lang() {
		return prog_lang;
	}

	public void setProg_lang(String prog_lang) {
		this.prog_lang = prog_lang;
	}

	public Programmer(String name, String address, double salary, String job_title, String department,
			String prog_lang) {
		super(name, address, salary, job_title);
		this.department = department;
		this.prog_lang = prog_lang;
	}

	public void generatePerformanceReport() {
		System.out.println("Performance report on the Programmer, " + getName() + " in " + department
				+ " department and who specializes in " + prog_lang + " language has an Excellent performance.");

	}

	public void manageProjects(String d, String e, String f) {
		String project_1 = d;
		String project_2 = e;
		String project_3 = f;
		System.out.println(getName() + " manages projects such as: ");
		System.out.println("1: " + project_1);
		System.out.println("2: " + project_2);
		System.out.println("3: " + project_3);
	}
}
