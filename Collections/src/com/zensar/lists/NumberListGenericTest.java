package com.zensar.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class NumberListGenericTest {
	public static void main(String[] args) {
		ArrayList<Integer> numlist = new ArrayList<Integer>();
		numlist.add(100);
		numlist.add(200);
		numlist.add(500);
		numlist.add(300);
		numlist.add(400);
		
		System.out.println(numlist);
		System.out.println("using iterator");
		Iterator<Integer> it= numlist.iterator();
		
		while (it.hasNext()) {
			int ele= it.next();
			System.out.println(ele);
			
		}
		
		System.out.println("using for loop and get method");
		for (int i = 0; i < numlist.size(); i++) {
			int ele= numlist.get(i);
			System.out.println(ele);
			
		}
		
		numlist.remove(0);  //remove, pass index
		Collections.sort(numlist);    //SORTED LIST
		
		System.out.println("using for each loop");
		  for(int e: numlist) 
		  { 
			  System.err.println(e); 
		  }
		  
		  Comparator<Integer> c = Collections.reverseOrder();
		  Collections.sort(numlist, c);
		  System.out.println(" reverse sorted using for each loop");
		  for(int e: numlist) 
		  { 
			  System.err.println(e); 
		  }
		 
	}

}
