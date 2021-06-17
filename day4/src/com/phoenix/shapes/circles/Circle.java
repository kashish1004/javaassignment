package com.phoenix.shapes.circles;
/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */

import com.phoenix.shapes.Shape;

public class Circle extends Shape {
	private float radius;
	public Circle() {
		System.out.println("Default Constructor of Circle");
	}
	public Circle(float radius) {
		this.radius = radius;
		System.out.println("Parameterized Constructor of Circle");
	}
	public void calculateArea() {
		System.out.println("Area of Circle is: "+ MATH_PI*radius*radius);
	}
	public void calculatePerimeter() {
		System.out.println("Perimeter of Circle is: "+ 2*MATH_PI*radius);
	}
}
