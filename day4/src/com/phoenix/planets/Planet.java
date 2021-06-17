package com.phoenix.planets;
/* Author kashish.jain@stltech.in
 * Creation Date - 16-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Revolvable;
import com.phoenix.interfaces.Rotatable;

public abstract class Planet implements Movable, Rotatable, Revolvable {

	private int noOfMoons;
	public void setNoOfMoons(int n) {
		noOfMoons = n;
	}
	public int getNoOfMoons() {
		return noOfMoons;
	}
	protected abstract boolean supportsLife();
	public String toString() {
		return "Number of Moons are: " + noOfMoons;
	}
	/*
	 * public void revolve() { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * 
	 * public void rotate() { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * 
	 * public void move() { // TODO Auto-generated method stub
	 * 
	 * }
	 */

}
