package com.phoenix.shapes.rectangles;
/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */

import com.phoenix.shapes.Shape;

public class Rectangle extends Shape {
	private int length,breadth;
	public Rectangle() {
		System.out.println("Default Constructor of Rectangle");
	}
	public Rectangle(int length,int breadth) {
		this.length = length;
		this.breadth = breadth;
		System.out.println("Parameterized Constructor of Rectangle");
	}
	public void calculateArea() {
		System.out.println("Area of Rectangle is: "+ length*breadth);
	}
	public void calculatePerimeter() {
		System.out.println("Perimeter of Rectangle is: "+ 2*(length+breadth));
	}
}
