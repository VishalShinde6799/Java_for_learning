package com.zensar.main;

import com.zensar.Outer;
import com.zensar.Outer.Inner;

public class RegularInnerTest {

	public static void main(String[] args) {
		Outer o= new Outer();
		Outer.Inner in= o.new Inner();
		in.display();
		Outer.Inner in1= new Outer().new Inner();
		in1.display();

	}

}
