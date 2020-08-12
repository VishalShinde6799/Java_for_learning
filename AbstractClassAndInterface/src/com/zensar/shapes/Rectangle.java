package com.zensar.shapes;

public class Rectangle extends Shape{

	
	
	 private int length;
	 private int breadth;
	 public Rectangle() {
		 length=10;
		 breadth=10;
		 System.out.println("default constructor of rect");
		// TODO Auto-generated constructor stub
	}
	 
	@Override
	public void calArea() {
		System.out.println("area is" +(length*breadth));
		// TODO Auto-generated method stub
		
	}


public Rectangle(int length, int breadth)
{
	  
	super(30);
	this.length=length;
	this.breadth=breadth;
	System.out.println("parameterised constructor of rectangle");
}
}
