package com.phoenix.machines;
/* Author kashish.jain@stltech.in
 * Creation Date - 16-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
import com.phoenix.interfaces.Movable;

public class Robot implements Movable {

	public void processData() {
		System.out.println("Robot Processes Data");
	}
	
	public void senseInfo() {
		System.out.println("Robot Senses Info");
	}
	
	public void useArtificialIntelligence() {
		System.out.println("Robot Uses AI");
	}
	
	public void move() {
		System.out.println("Robot Moves");

	}

}
