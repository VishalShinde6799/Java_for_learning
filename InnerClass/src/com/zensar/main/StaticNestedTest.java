package com.zensar.main;

import com.zensar.OuterS;

public class StaticNestedTest {
	public static void main(String[] args) {
		OuterS.InnerS in= new OuterS.InnerS();
		OuterS o = new OuterS();
		o.show();
		in.displayS();
		//System.out.println(in.c);  Private in Outer class
	}

}
