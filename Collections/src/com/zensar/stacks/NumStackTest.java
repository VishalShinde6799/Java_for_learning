package com.zensar.stacks;

import java.util.ArrayDeque;


public class NumStackTest {
	public static void main(String[] args) {
		ArrayDeque<Integer> numSt= new ArrayDeque<Integer>();
		
	numSt.addFirst(100);
	numSt.addFirst(200);
	numSt.addFirst(300);
	numSt.addFirst(400);
	numSt.addFirst(500);
	numSt.addFirst(600);
	
	System.out.println("the top of stack is: "+numSt.peekFirst());
	
	
	while(!numSt.isEmpty())
	{
		int ele = numSt.removeFirst();
		System.out.println("Pop out elements: "+ele);
	}
	System.out.println("the top of stack is: "+numSt.peekFirst());
	
	}

}
