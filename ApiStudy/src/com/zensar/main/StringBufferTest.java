package com.zensar.main;

public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		  
		  System.out.println("initial cap:: "+sb.capacity());
		  System.out.println("Character count::"+sb.length());
		  sb.append(" welcome");
		  System.out.println(sb);
		  System.out.println("Character count::"+sb.length());
		  System.out.println("initial cap:: "+sb.capacity());
		  StringBuffer sbl= sb.append(" to zensar").append(" training session");
		  System.out.println("initial cap:: "+sb.capacity());
		  System.out.println("Character count::"+sb.length());
		  sbl.reverse();
		  //System.out.println(sbr);
		  System.out.println(sbl.insert(3, " HII"));
		  System.out.println(sbl.replace(3, 5, "KA"));
		  
	}

}
