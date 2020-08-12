package com.zensar.main;

import com.zensar.Days;
import com.zensar.enums.Colors;
import com.zensar.enums.Expressions;
import com.zensar.enums.Gender;

public class EnumTest {

	public static void main(String[] args) {
		/*System.out.println(Colors.BLUE);
		System.out.println("COLOR CODE IS:" + Colors.BLUE.getCode());
		System.out.println(Colors.GREEN);
		Colors.GREEN.setCode(5);
		System.out.println("THE COLOR CODE OF GREEN IS:"+ Colors.GREEN.getCode());
		System.out.println(Gender.MALE);
		System.out.println(Days.TODAY);*/
		Expressions.LAUGH.setcode(4);
		Colors colour= Colors.PINK;
		Gender g1= Gender.OTHERS;
		Expressions e1= Expressions.SMILE;
		Expressions e = Expressions.CUTIE;
		/*System.out.println(e1 +", "+ e+ " ");
		System.out.println(g1);
		System.out.println(g1.ordinal());
		
		System.out.println("Printing All info..");*/
		
		for(Expressions exp: Expressions.values())
		{
			System.out.println(exp);
			System.out.println(exp.ordinal());
			System.out.println(exp.getcode());
		}
		
		for(Colors clr: Colors.values())
		{
			System.out.println(clr);
			System.out.println(clr.ordinal());
			System.out.println(clr.getCode());
		}

	}

}
