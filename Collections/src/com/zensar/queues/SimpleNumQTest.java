package com.zensar.queues;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleNumQTest {
	public static void main(String[] args) {
		
		Queue<Integer> numQ = new LinkedList<Integer>();
		numQ.add(400);
		numQ.add(500);
		numQ.add(100);
		numQ.add(200);
		numQ.offer(300);
		numQ.offer(400);
		numQ.add(500);
		
		System.out.println("Head of queue: "+numQ.peek());
		System.out.println("polled this one out, ehh:: "+numQ.poll());
		System.out.println("the new head: "+numQ.peek());
		
		while(!numQ.isEmpty())
		{
			int ele= numQ.poll();
			System.out.println(ele);
			//System.err.println("head is: "+numQ.peek());
		}
		
		System.out.println(numQ.peek());
	}

}
