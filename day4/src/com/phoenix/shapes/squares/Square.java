package com.phoenix.shapes.squares;
/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */

import com.phoenix.shapes.Shape;

public class Square extends Shape {
	private int side;
	public Square() {
		System.out.println("Default Constructor of Square");
	}
	public Square(int side) {
		this.side = side;
		System.out.println("Parameterized Constructor of Square");
	}
	public void calculateArea() {
		System.out.println("Area of Square is: "+ side*side);
	}
	public void calculatePerimeter() {
		System.out.println("Perimeter of Square is: "+ 4*side);
	}
}
