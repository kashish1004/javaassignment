package com.phoenix.vehicles.cars;
/* Author kashish.jain@stltech.in
 * Creation Date - 16-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Runnable;
import com.phoenix.vehicles.Vehicle;

public class Car extends Vehicle implements Movable, Runnable {

	public void start() {
		System.out.println("Car Starts");
	}
	
	public void stop() {
		System.out.println("Car Stops");
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Car Runs");
	}

	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Car Moves");
	}

}
