package com.zensar.main;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println("start on main\n enter a number::\n");
		Scanner sc= new Scanner(System.in);
		
		
		
		
		try
		{
		    int divisor= sc.nextInt();
			int result= 10/divisor;
			System.out.println("the result is:: " +result);	
			
			int arr[]= {10,20};
			arr[1]=330;
			for(int ele:arr)
				System.out.println(ele +"\t");
	
			Integer i1= 10;
			int a= i1.intValue();
			System.out.println("a::" +a);
			
		}
		
		
		catch(ArithmeticException e)
		{
			System.err.println(e.getMessage());
			//System.err.println("Cannot divide due to zero as divisor");
			//e.printStackTrace();
		}
		
		
		
		  catch(ArrayIndexOutOfBoundsException p) {
			  System.err.println(p.getMessage());
		  System.err.println("Array chi size basat nahi oooo"); 
		  }
		 
		catch(Exception e1)
		{
			System.err.println(e1.getMessage());
		}
		finally 
		{
			System.out.println("always executed");
			sc.close();
		}
		System.out.println("end of main");
	}

}
