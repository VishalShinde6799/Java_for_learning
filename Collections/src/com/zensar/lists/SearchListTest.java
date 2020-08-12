package com.zensar.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SearchListTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> numlist = new ArrayList<Integer>();
		numlist.add(100);
		numlist.add(200);
		numlist.add(200);
		numlist.add(200);
		numlist.add(500);
		numlist.add(300);
		numlist.add(400);
		
		 //Comparator<Integer> c = Collections.reverseOrder();
		  Collections.sort(numlist);
		
		System.out.println(numlist);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element to search");
		int key= sc.nextInt();
		int searchIndex = Collections.binarySearch(numlist, key);
		System.out.println("element found at index:: "+searchIndex);
	}
	
	
}
