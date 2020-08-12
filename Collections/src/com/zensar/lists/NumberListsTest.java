package com.zensar.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

public class NumberListsTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(new Integer(400));
		list.add(new Double(70.5));
		list.add("welcome");
		list.add(new Date());
		
		Iterator it = list.iterator();
		
		while (it.hasNext()) 
		{
			Object ob= it.next();
			System.out.println(ob);			
		}
		
		Collections.sort(list);
	}
}
