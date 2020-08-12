package com.zensar.shapes;

public abstract class Shape {

	private int a;  
	
	public Shape()
	{
		a=10;
	}
	
	public Shape(int a)
	{
		super();
		this.a=a;         //abstract class can have constructor
	}                       //concrete methods have body

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public abstract void calArea();
}
