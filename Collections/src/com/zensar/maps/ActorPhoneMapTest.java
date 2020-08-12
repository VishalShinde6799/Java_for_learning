package com.zensar.maps;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



public class ActorPhoneMapTest {
public static void main(String[] args) {
	Comparator<String> c = Collections.reverseOrder();
	//Map<String, Long> actorMap = new HashMap<String, Long>();
	//Map<String, Long> actorMap = new LinkedHashMap<String, Long>();
	Map<String, Long> actorMap = new TreeMap<String, Long>(c);
	actorMap.put("Vishal", 9923083747l);
	actorMap.put("Pradnya", 9545611044l);
	actorMap.put("Vaishnavi", 7887371093l);
	actorMap.put("Viru", 1234567890l);
	actorMap.put("Abhishek", 7972403778l);
	actorMap.put("Yukta", 7410535423l);
	
	System.out.println("Phone number of QT:: "+actorMap.get("Pradnya"));
	
	Set<String> people = actorMap.keySet();
	System.out.println(people);
	
	System.out.println("the people are:: ");
	for (String string : people) {

		Long phone = actorMap.get(string);
		System.out.println("person: " +string+" number: "+phone);
	}
}
}
