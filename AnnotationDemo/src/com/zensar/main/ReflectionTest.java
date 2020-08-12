package com.zensar.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.zensar.utilities.CopyrightInfo;

// reflection is done by JVM
public class ReflectionTest {

	public static void main(String[] args) {
		try {
			Object o=new Object();
			Class c = Class.forName("com.zensar.products.Product");
			System.out.println("Product class is loaded");
			Field arrF[]= c.getFields(); //returns info about public members
			Field fArr[] = c.getDeclaredFields(); //returns info about all members.
			Method mArr[]=c.getDeclaredMethods();
			Constructor cArr[]= c.getDeclaredConstructors();
			
			
			//Field typeArr[]=c.ge
			System.err.println("Fields:: ");
			for(Field f: fArr )
				System.out.println(f);
			
			System.err.println("methods::");
			for(Method m: mArr)
			{
				System.out.println(m);
				System.out.println();
			}
			System.err.println("Constructors::");
			for(Constructor cons: cArr )
			{
				System.out.println(c);
				System.out.println();
			}
			
			CopyrightInfo cpAnno=(CopyrightInfo) c.getAnnotation(CopyrightInfo.class);
			System.out.println("Author:: " +cpAnno.author());
			System.out.println("Version:: "+cpAnno.version());
			System.out.println("Copyright: "+cpAnno.copyright());
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		catch (Exception e) {
			System.err.println(e);
		}
		

	}

}
