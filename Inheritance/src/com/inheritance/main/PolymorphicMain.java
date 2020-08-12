package com.inheritance.main;

import com.zensar.emp.Employee;
import com.zensar.emp.Manager;
import com.zensar.emp.wages.WageEmployee;

public class PolymorphicMain {

	public static void main(String[] args) {
		Employee e1 = new Manager();
		e1= new Manager();
		e1.display();
		double incen= ((Manager)e1).getIncentive();
		System.out.println("the incentive is:"+incen);
		
		e1= new WageEmployee();
		e1.display();
		WageEmployee we= (WageEmployee)e1;
		System.out.println("the hours are:: "+we.getHours());
		System.out.println("The rate is:: "+we.getRate());
		
		
		
		  Object obj = new Employee();
		  ((Employee)obj).display();
		  System.out.println("the hashcode for employee is:: \n\n");
		  System.out.println(((Employee)obj).hashCode());
		  System.out.println();
		  
		  obj= new Manager();
		  ((Manager)obj).display();
		  System.out.println("the hashcode for Manager is::\n\n");
		  System.out.println(((Manager)obj).hashCode());
		  System.out.println();
		  
		  obj= new WageEmployee();
		  ((WageEmployee)obj).display();
		  System.out.println("the hashcode for Wages is::\n\n");
		  System.out.println(((WageEmployee)obj).hashCode());
		  System.out.println();
		  //WageEmployee e = (WageEmployee(obj)).display();
		 
	}

}
