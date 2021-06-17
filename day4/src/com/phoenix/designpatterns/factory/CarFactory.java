package com.phoenix.designpatterns.factory;
/* Author kashish.jain@stltech.in
 * Creation Date - 16-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
import com.phoenix.designpatterns.factory.cars.Car;
import com.phoenix.designpatterns.factory.cars.CoupleCar;
import com.phoenix.designpatterns.factory.cars.LuxuryCar;
import com.phoenix.designpatterns.factory.cars.SedanCar;
import com.phoenix.designpatterns.factory.cars.SportCar;

public class CarFactory {
	public static Car newCar(String CarType) {
		if(CarType.equals("Luxury"))
			return new LuxuryCar();
		else if(CarType.equals("Couple"))
			return new CoupleCar();
		else if(CarType.equals("Sedan"))
			return new SedanCar();
		else if (CarType.equals("Sport"))
			return new SportCar();
		else
			return null;
	}
}
