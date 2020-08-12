package com.zensar.main;

import com.zensar.interfaces.Movable;
import com.zensar.interfaces.Washable;
import com.zensar.livingbeings.Tiger;
import com.zensar.planets.Planet;
import com.zensar.robotics.Robot;
import com.zensar.vehicles.cars.Car;

public class InterfaceMain {

	public static void main(String[] args) {
		Movable m = null;
		
		m=new Tiger();
		Tiger t= new Tiger();
		t.eat();
		m.move();
		
		
		m= new Planet();
		m.move();
		
		m= new Car();
		Washable w= (Washable)m;
		m.move();
		w.wash();
		
		m= new Robot();
		m.move();

	}

}
