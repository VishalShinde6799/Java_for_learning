package com.zensar.shapes;

public class Circle extends Shape {
	
	private int r;
	public static final double PI= 3.1423;
	public Circle() {
		r=10;
		System.out.println("default cons. of circle");
	}
	

	public Circle(int r) {
		super(20);
		this.r = r;
		System.out.println("para. cons. of circle");
	}


	@Override
	public void calArea() {
		System.out.println("The radius of circle is::"+(PI*r*r));

	}

}
