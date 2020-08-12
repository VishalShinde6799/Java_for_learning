package com.zensar.livingbeings;

import com.zensar.interfaces.Movable;
import com.zensar.interfaces.Washable;

public abstract class Animals implements Movable, Washable {
	
	public abstract void eat();
	
@Override
public void wash() {
	System.out.println("tiger gets washed");
}
	}

