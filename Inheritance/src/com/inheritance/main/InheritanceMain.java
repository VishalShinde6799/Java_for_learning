package com.inheritance.main;

import com.zensar.emp.Employee;
import com.zensar.emp.Manager;
import com.zensar.emp.wages.WageEmployee;

public class InheritanceMain {

	public static void main(String[] args) {
		
		Employee e1= new Employee();
		e1.display();
		
		Employee e2 = new Employee(4004, "khandu", 5000);
		e2.display();
		
		Manager m1= new Manager();
		m1.display();
		
		Manager m2= new Manager(3020, "pandu", 3500.0f, 600.0);
		m2.display();
		System.out.println(m2.getIncentive());
		
		System.out.println();
		
		
		WageEmployee w1= new WageEmployee();
		w1.display();
		

	}

}
