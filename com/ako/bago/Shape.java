package com.ako.bago;

public class Shape {

	private double perimeter;
	private double area;
	static final double pie = 3.14;
	static int r;
	public double getPerimeter(int radius) {
		r = radius;
		perimeter = 2*pie*r;
		double result = perimeter;
		System.out.println("This is Perimeter "
				+ "of the circle: " + result);
		return perimeter;
	}
	public double getArea(int radius) {
		r = radius;
		area =  pie*(r*=r);
		double result = area;
		System.out.println("This is Area of "
				+ "the circle: " + result);
		return area;
	}
	
	
	
	
	
	
}
