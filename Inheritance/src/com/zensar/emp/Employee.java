package com.zensar.emp;

public  class Employee {
	protected int empId;
	private String name;
	private float salary;
	
	public Employee() {
		empId=1000;
		name="abc";
		salary=1000.0f;
	 System.out.println("default of employee");
	}

	public Employee(int empId, String name, float salary) {
		super();    
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		System.out.println("parameterized cons. of employee");
	}

	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

	
	  public void display() { 
		  System.out.println("Display of employee");
	  System.out.println("EmpId:"+empId); 
	  System.out.println("Name:"+name);
	  System.out.println("Salary:"+salary); 
	  System.out.println(); 
	  }
	 
	
}

