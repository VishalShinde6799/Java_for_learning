package com.zensar.main;

import java.io.IOException;
import java.util.Scanner;

import com.zensar.math.MathEngine;

public class DivisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start of div. main");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the divisor");
		
		try{
		
			int divisor= sc.nextInt();
			int result= MathEngine.divide(divisor);
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		//catch(ArithmeticException e)
		//{
			//e.printStackTrace();
		//}
		
			
		
		
		System.out.println("End of main");

	}
	

}
