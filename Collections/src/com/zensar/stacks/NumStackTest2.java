package com.zensar.stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class NumStackTest2 {
	
	public static void main(String[] args) {
		Deque<Integer> numSt= new ArrayDeque<Integer>();
		numSt.push(100);
		numSt.push(200);
		numSt.push(300);
		numSt.push(400);
		numSt.push(500);
		numSt.push(600);
		numSt.push(700);
		
		System.out.println("the top of stack is: "+numSt.peek());
		
	}

}
