package com.phoenix.designpatterns.singleton;
/* Author kashish.jain@stltech.in
 * Creation Date - 16-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sun s1 = Sun.getInstance();
		s1.giveLight();
		Earth e1 = Earth.getInstance();
		e1.createLife();
		PrimeMinister pm = PrimeMinister.getInstance();
		pm.serveNation();
		President p1 = President.getInstance();
		p1.representNation();

	}

}
