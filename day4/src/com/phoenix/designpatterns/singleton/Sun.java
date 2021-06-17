package com.phoenix.designpatterns.singleton;
/* Author kashish.jain@stltech.in
 * Creation Date - 16-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
public class Sun {
	private static Sun s;
	private Sun() {}
	public static Sun getInstance() {
		if(s == null)
			s = new Sun();
		return s;
	}
	void giveLight() {
		System.out.println("Sun Gives Light");
	}
}
