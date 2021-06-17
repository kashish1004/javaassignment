package com.phoenix.shapes.main;
/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
import com.phoenix.shapes.Shape;
import com.phoenix.shapes.circles.Circle;
import com.phoenix.shapes.rectangles.Rectangle;
import com.phoenix.shapes.squares.Square;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
		s = new Circle(1.2f);
		s.calculateArea();
		s.calculatePerimeter();
		s = new Rectangle(12,5);
		s.calculateArea();
		s.calculatePerimeter();
		s = new Square(8);
		s.calculateArea();
		s.calculatePerimeter();
	}

}
