package com.phoenix.vehicles;
/* Author kashish.jain@stltech.in
 * Creation Date - 16-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
public abstract class Vehicle {
	protected void start() {
		System.out.println("Vehicle Starts");
	}
	protected void stop() {
		System.out.println("Vehicle Stops");
	}
}
