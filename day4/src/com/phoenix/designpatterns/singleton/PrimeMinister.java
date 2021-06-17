package com.phoenix.designpatterns.singleton;
/* Author kashish.jain@stltech.in
 * Creation Date - 16-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
public class PrimeMinister {
	private static PrimeMinister p;
	private PrimeMinister() {}
	public static PrimeMinister getInstance() {
		if(p == null)
			p = new PrimeMinister();
		return p;
	}
	void serveNation() {
		System.out.println("PM Serves the Nation");
	}
}
