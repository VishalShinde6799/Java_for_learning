package com.zensar.emp.wages;

import com.zensar.emp.Employee;

public class WageEmployee extends Employee {
	private int hours;
	private float rate;
	public WageEmployee() {
		hours=10;
		rate=100;
		System.out.println("default cons. of wageEmployee");
	}
	public WageEmployee(int empId, String name, float salary, int hours, float rate) {
		super(empId, name, salary);
		this.hours = hours;
		this.rate = rate;
		System.out.println("para. cons. of WageEmployee");
	}
	
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Display of wageEmployee");
		System.out.println("hours: "+hours);
		System.out.println("rate: "+rate);
	}
	
}
