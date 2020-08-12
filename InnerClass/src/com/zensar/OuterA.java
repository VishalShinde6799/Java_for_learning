package com.zensar;

import com.zensar.interfaces.Printable;

import ccom.zensar.classes.Animal;

public class OuterA {
	
	//anonymous inner class which is subclass of animal//doesn't have name
	// doesn't have constructor
	// doesn't have special methods
	Animal ob = new Animal() {
		private int noOfLegs;
		{
			noOfLegs = 100;
		}
		
		public void eat() {
			super.eat();
			System.out.println("Anonymous: ");
		}
		
		public void run() {
			System.out.println("Animals runs with " + noOfLegs + " legs");
		}
	};
 public void showAIC()
 {
	 ob.eat();
	 ob.run();
	 p.print();
 }
 Printable p = new Printable() 
 {
	
	@Override
	public void print() {
		System.out.println("anonymous object's print");
		
	}
};

}
