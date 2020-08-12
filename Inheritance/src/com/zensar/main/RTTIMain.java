package com.zensar.main;

import com.zensar.emp.Employee;
import com.zensar.emp.Manager;
import com.zensar.emp.wages.WageEmployee;

//RTTI- runtime type identification(dynamic type identification)
public class RTTIMain {
	
	public static void showEmpInfo(Employee e)
	{
		e.display();
		
		
		  if(e instanceof Manager) 
		  { 
			  System.out.println("\n\n\n"+e);
			  double incen= ((Manager)e).getIncentive();
		  System.out.println("the incentive is xxxxx::"+incen);
		  } 
		  if(e instanceof WageEmployee) 
		  {
			  System.out.println("\n\n\n"+e);
		  WageEmployee we= (WageEmployee)e;
		  System.out.println("the hours count ais:: "+we.getHours());
		  System.out.println("The rate is:: "+we.getRate()); 
		  }
		 
		
		/*
		 * double incen= ((Manager)e).getIncentive();
		 * System.out.println("the incentive is xxxxx::"+incen);
		 * 
		 * 
		 * WageEmployee we= (WageEmployee)e;
		 * System.out.println("the hours count ais:: "+we.getHours());
		 * System.out.println("The rate is:: "+we.getRate());
		 */
		
	}

	public static void main(String[] args) {
		
		//showEmpInfo(new Employee());
		showEmpInfo(new Manager());
		showEmpInfo(new WageEmployee());
		
	}

}
