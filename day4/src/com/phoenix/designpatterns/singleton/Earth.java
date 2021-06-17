package com.phoenix.designpatterns.singleton;
/* Author kashish.jain@stltech.in
 * Creation Date - 16-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
public class Earth {
	private static Earth e;
	private Earth() {}
	public static Earth getInstance() {
		if(e == null)
			e = new Earth();
		return e;
	}
	void createLife() {
		System.out.println("Earth Creates Life");
	}
}
