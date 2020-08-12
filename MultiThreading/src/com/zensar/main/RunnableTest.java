package com.zensar.main;

import com.zensar.runnable.MyRunnable;

public class RunnableTest {
	public static void main(String[] args) {
		Runnable r1 = new MyRunnable("ding", 5000);
		Runnable r2 = new MyRunnable("Dong", 5000);
		
		Thread t1= new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.setName("Vishal");
		t2.setName("Pradnya");
		
		t1.setPriority(1);
		t2.setPriority(10);
		t1.start();
		t2.start();
	}

}
