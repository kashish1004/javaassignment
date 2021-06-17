package com.phoenix.living.pet;
/* Author kashish.jain@stltech.in
 * Creation Date - 16-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
import com.phoenix.interfaces.Walkable;
import com.phoenix.living.Animal;

public class Cat extends Animal implements Walkable {

	
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("Cat Jumps");

	}

	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Cat Runs");
	}

	
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Cat Walks");

	}


	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Cat Moves");
	}

}
