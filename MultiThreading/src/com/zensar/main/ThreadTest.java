package com.zensar.main;

import com.zensar.threads.PingPong;

public class ThreadTest {
	
	public static void main(String[] args) {
		PingPong t1= new PingPong("ping", 800);
		//if class extends Thread class, you can either create
		//instance of your class or Thread class
		//if class implements runnable, create object of your class
		// create object of thread class, pass your object in the constructor
		//call start for the thread object
		Thread t2 = new PingPong("Pong", 800);
		t1.setName("Vishal");
		t2.setName("pradnya");
		t2.start();
		//t2.notify();
		t1.start();
		//t1.notify();
	}

}
