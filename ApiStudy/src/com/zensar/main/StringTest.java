package com.zensar.main;

//import com.sun.org.apache.xpath.internal.operations.Equals;

public class StringTest {

	public static void main(String[] args) {
		String s= "Hello";
		String s1= "Hello";
		
		/*
		 * if(s==s1) System.out.println("It's a match"); else
		 * System.out.println("no match"); if(s.equals(s1))
		 * System.out.println("same content"); else System.out.println("diff content");
		 */
				System.out.println(s.concat(" Welcome"));
				String s3= s.toUpperCase().concat(" welcome to")+ (" DPU").toLowerCase();
				System.out.println(s3);
	//no matter how much i appreciate your charm, you'll always find a way to outrun my thoughts	
				String s4= "Pradnya";
				String s5= s4.substring(1);
				System.out.println(s5);
				System.out.println(s3.replace('o', 'i'));
				
	}

}
