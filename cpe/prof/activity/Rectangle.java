package cpe.prof.activity;

public class Rectangle {

	public static void main(String[] args) {
		Shape shape = new Shape();
		
		int x = 48;
		int y = 32;
		int answer = shape.getArea(x, y);
		System.out.println("The area of your "
				+ "Rectangle is: " + answer);
	}
	
}
