package com.zensar.sets;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class NumSetTest {
	public static void main(String[] args) {
		//Set<Integer> numset= new HashSet<Integer>();  //unordered and unsorted
		//Set<Integer> numset = new LinkedHashSet<Integer>();   //ordered and unsorted
		//Set<Integer> numset = new TreeSet<Integer>();
		Comparator<Integer> c = Collections.reverseOrder();
		Set<Integer> numset = new TreeSet<Integer>(c);
		System.out.println(numset.add(100));
		numset.add(350);
		numset.add(300);
		numset.add(400);
		numset.add(500);
		numset.add(600);
		System.out.println(numset.add(100)); //duplicate element cannot be added
		
		
		System.out.println(numset);
		
		for (Integer integer : numset) {
			System.out.println(integer);
			
		}
		
	
	}

}
