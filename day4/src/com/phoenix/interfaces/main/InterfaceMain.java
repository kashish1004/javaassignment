package com.phoenix.interfaces.main;
/* Author kashish.jain@stltech.in
 * Creation Date - 16-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
import com.phoenix.interfaces.Movable;
import com.phoenix.living.pet.Cat;
import com.phoenix.living.wild.Tiger;
import com.phoenix.machines.HumanRobot;
import com.phoenix.planets.Earth;
import com.phoenix.planets.Jupiter;
import com.phoenix.vehicles.cars.Car;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movable m;
		m = new Earth();
		Earth e = ((Earth)m);
		e.setNoOfMoons(1);
		System.out.println("Earth:");
		System.out.println(m);
		m.move();
		e.revolve();
		e.rotate();
		System.out.println("Earth Supports Life ?: "+ e.supportsLife());
		m = new Jupiter();
		Jupiter j = ((Jupiter)m);
		j.setNoOfMoons(79);
		System.out.println("Jupiter:");
		System.out.println(j);
		j.move();
		j.revolve();
		j.rotate();
		System.out.println("Jupiter Supports Life ?: "+ j.supportsLife());
		m = new Tiger();
		Tiger t = ((Tiger)m);
		System.out.println("Tiger:");
		t.jump();
		t.run();
		t.move();
		t.walk();
		m = new Cat();
		Cat c = ((Cat)m);
		System.out.println("Cat:");
		c.jump();
		c.run();
		c.move();
		c.walk();
		m = new Car();
		Car c1 = ((Car)m);
		System.out.println("Car:");
		c1.start();
		c1.stop();
		c1.run();
		c1.move();
		m = new HumanRobot();
		HumanRobot r = ((HumanRobot)m);
		System.out.println("Human Robot:");
		r.jump();
		r.run();
		r.walk();
		
	}

}
