package com.ako.bago;

public class Circle {
	
	public static void main(String[] args) {
		int radius = 300; 
		Shape shape = new Shape();
		
		System.out.println("This is for getting the "
				+ "Perimeter");
		shape.getPerimeter(radius);
		
		System.out.println("This is for getting the "
				+ "Area");
		shape.getArea(radius);
		
	}

}
