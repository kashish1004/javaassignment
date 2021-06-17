package com.phoenix.designpatterns.factory.main;
/* Author kashish.jain@stltech.in
 * Creation Date - 16-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */

import com.phoenix.designpatterns.factory.CarFactory;
import com.phoenix.designpatterns.factory.cars.Car;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = args[0];
		Car c1 = CarFactory.newCar(s);
		c1.start();
		c1.run();
		c1.stop();
	}

}
