package com.ako.bago;

public class Main {

	public static void main(String[] args) {
		// For a Developer
		String a = "E-commerce Platform with Server-Side Rendering (SSR)";
		String b = "Content Management System (CMS) with Incremental Static Regeneration (ISR)";
		String c = "Progressive Web Application (PWA) for a Social Networking Platform";
		
		// For a Manager
		
		String x = "Development Process Optimization";
		String y = "Cross-Functional Collaboration for Feature Development";
		String z = "Performance and Scalability Improvements";
		
		
		// For a Programmer
		String d = "Data Analysis Platform for Healthcare Analytics";
		String e = "Natural Language Processing (NLP) Platform for Text Analytics";
		String f = "Microservices Architecture for Financial Trading System";
		
		
		// TODO Auto-generated method stub
		Manager manager = new Manager("Christian Abusca", "Taguig City", 480000, "Manager", "Software Development");
		Developer dev = new Developer("Drey Abusca", "Makati City", 250000, "Next JS Developer", "Software Development");
		Programmer prog = new Programmer("Christian Dreigh", "Sta. Mesa Manila", 360000, "Senior Software Engineer", "Software Development", "Python");
	
		System.out.println("Manager Details:");
        System.out.println("Name: " + manager.getName());
        System.out.println("Address: " + manager.getAddress());
        System.out.println("Salary: ₱" + manager.getSalary());
        System.out.println("Job Title: " + manager.getJob_title());
        System.out.println("Department: " + manager.getDepartment());
        manager.bonus();
        manager.generatePerformanceReport();
        manager.manageProjects(x, y, z);
        
        System.out.println();
        
        System.out.println("Developer Details: ");
        System.out.println("Name: " + dev.getName());
        System.out.println("Address: " + dev.getAddress());
        System.out.println("Salary: ₱" + dev.getSalary());
        System.out.println("Job Title: " + dev.getJob_title());
        System.out.println("Department: " + dev.getDepartment());
        dev.bonus();
        dev.generatePerformanceReport();
        dev.manageProjects(a, b, c);
	
        System.out.println();
        
        System.out.println("Programmer Details: ");
        System.out.println("Name: " + prog.getName());
        System.out.println("Address: " + prog.getAddress());
        System.out.println("Salary: ₱" + prog.getSalary());
        System.out.println("Job Title: " + prog.getJob_title());
        System.out.println("Department: " + prog.getDepartment());
        prog.bonus();
        prog.generatePerformanceReport();
        prog.manageProjects(d, e, f);
	}

}
