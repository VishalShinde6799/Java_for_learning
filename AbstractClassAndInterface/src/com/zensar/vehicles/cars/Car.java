package com.zensar.vehicles.cars;

import com.zensar.interfaces.Movable;
import com.zensar.interfaces.Washable;
import com.zensar.vehicles.Vehicle;

public class Car extends Vehicle implements Movable, Washable {
	
	@Override
	public void move() {
	System.out.println("car moves");
	}

	@Override
	public void wash() {
		System.out.println("car is washed");
		
	}
}
