package com.zensar.demo;

import com.zensar.MyDate;

public class DateDemo {

	public static void main(String[] args) {
		MyDate d= new MyDate();
		d.printdate();
		
		MyDate d1= new MyDate(10,12,1991);
		System.out.println(d1.getDay());
		System.out.println(d1.getMonth());
		System.out.println(d1.getYear());
		d1.printdate();
	}

}
