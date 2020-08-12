package com.zensar.emp;

import com.zensar.emp.wages.WageEmployee;

public class Manager extends Employee {
	
	private double incentive;
	
	public Manager() {
		//this(5600, "abcd", 0000.0f, 0000.00);
		incentive=5000.0;
		System.out.println("Default cons of manager");
	}
	
	WageEmployee w1= new WageEmployee();
	
	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	public Manager(int empId, String name, float salary, double incentive)
	{
		super(empId, name, salary); //super statement
		this.incentive=incentive;
		System.out.println("the para. cons. of manager");
	}

		//overrides display() of superclass employee
	
	
	  public void display() 
	  { 
	   super.display();
	   System.out.println("incentive:"+incentive);
	  }
	 
	 
	
	

}
