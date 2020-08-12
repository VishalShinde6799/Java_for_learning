package com.zensar.main;

import java.util.Scanner;

import ccom.zensar.factorial.exception.FactorialNotPossibleException;

public class FactorialTest {
	public static long fact(int num) throws FactorialNotPossibleException
	{
		long facto=1;	
		if (num<0)
			throw new FactorialNotPossibleException();
		else if(num==0)
			facto=1;
		else
			{
				for (int i = num ;i>0; i--) 
				{
					facto=facto*i;
				}
			}
		
		return facto;
	}
	
	
	public static void main(String[] args) {
		int choice;
		Scanner sc= new Scanner(System.in);
	do
		{
		System.out.println("Enter the number for which you want to calculate factorial");
		
		try {
			int num=sc.nextInt();
			System.out.println("the factorial is:: "+fact(num));
		} 
		catch (FactorialNotPossibleException e) 
		{
			System.err.println(e.getErrMessage());
		}
		System.out.println("do you want to continue...?\t 1/0");
		choice= sc.nextInt();
		}
		while(choice!=0);
	}

}
