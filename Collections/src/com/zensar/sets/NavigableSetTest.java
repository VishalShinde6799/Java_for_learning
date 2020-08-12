package com.zensar.sets;

import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class NavigableSetTest {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		NavigableSet<Double> navSet= new TreeSet<Double>();
		navSet.add(11.5);
		navSet.add(11.1);
		navSet.add(11.0);
		navSet.add(10.8);
		navSet.add(10.5);
		navSet.add(10.4);
		navSet.add(10.2);
		
		System.out.println(navSet);
		int choice;
		
		do {
			System.out.println("enter the element");
			double d = sc.nextDouble();
			System.out.println("NavSet ceiling is:: " + navSet.ceiling(d));
			System.out.println("NavSet floor is:: " + navSet.floor(d));
			System.out.println("NavSet higher is:: " + navSet.higher(d));
			System.out.println("NavSet lower is:: " + navSet.lower(d));
			System.out.println("continue,...?");
			 choice = sc.nextInt();
		} while (choice!=0);
		
	}

}
