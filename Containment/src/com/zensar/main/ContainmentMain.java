package com.zensar.main;

import com.zensar.products.Product;
import com.zensar.students.Student;
import com.zensar.util.Date;

public class ContainmentMain {

	public static void main(String[] args) {
		Product p1= new Product();
		Student s1 = new Student();
		System.out.println(p1);
		Product p2= new Product(2001, "laptop", "HP", 50000, new Date(12, 7, 2019));
		System.out.println(p2);
		System.out.println(s1);
	}

}
