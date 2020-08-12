package com.zensar.main;

public class WrappereTst {

	public static void main(String[] args) {
		int a=10;
		
		@SuppressWarnings("deprecation")
		
		//to convert premitive to object..!
		Integer i1= new Integer(a); //Wrapping...!
		System.out.println(i1);
		
		
		//to convert object to premitive value...!
		int b= i1.intValue();  //unwrapping...!
		System.out.println(b);
		
		float f=0.25f;
		@SuppressWarnings("deprecation")
		Float f1= new Float(f);
		
		float g= f1.floatValue();
		System.out.println(g);
		
		byte b2= f1.byteValue();
		System.out.println(b2);
		
		String agstr= "24 ".trim();
		int age= Integer.parseInt(agstr);
		System.out.println(age);
		
		//Autoboxing and Autounboxing:: added since java 5
		
		int v=100;    //autoboxing
		Integer v1= v;
		System.out.println("\n"+v1);
	
	//autounboxing
		int z=v1;
		System.out.println("\n"+z);
		
		double d = 5.123;                           
		Double d1= d;  //auto boxing
		System.out.println(d1);
		
		double d2=d1;  // autounboxing
		System.out.println(d2);
		
		int j= 45;  
		//Float k = j;  //compiler error due to changed types between object and premitiveszdxr
		Float k = (float)j; //solution to above
		
		Integer i7= 600;
		float f5 = i7;
		System.out.println(f5);
	}
}
