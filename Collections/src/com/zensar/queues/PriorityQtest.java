package com.zensar.queues;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQtest {
	public static void main(String[] args) {
		Comparator<Integer> c = Collections.reverseOrder();
		
		Queue<Integer> pQ = new PriorityQueue<Integer>(c);
		pQ.add(700);
		pQ.add(300);
		pQ.add(500);
		pQ.add(800);
		pQ.add(200);
		pQ.add(600);
		pQ.add(400);
		
		System.out.println(pQ);
		
		while (!pQ.isEmpty()) {
			pQ.remove();
			
		}
		
		System.out.println("the head of queue is: "+pQ.peek());
	}

}
