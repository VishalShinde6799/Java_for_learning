package com.zensar.math;

public class MathEngine {
	private int a;
	private int b;
	public static int s=0;
	public static void add(int... v)
	{
		System.out.println("addition");
		s=0;
		for(int ele:v)
		{
			
			s += ele;
			
		}
		System.out.println(s);
	}
	

}
