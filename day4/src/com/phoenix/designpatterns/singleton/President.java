package com.phoenix.designpatterns.singleton;
/* Author kashish.jain@stltech.in
 * Creation Date - 16-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
public class President {
	private static President p;
	private President() {}
	public static President getInstance() {
		if(p == null)
			p = new President();
		return p;
	}
	void representNation() {
		System.out.println("President represents Nation");
	}
}
