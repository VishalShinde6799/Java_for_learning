package com.zensar.threads;

public class PingPong extends Thread {

	private String message;
	private long delay;
	
	public PingPong(String message, long delay) {
		super();
		this.message = message;
		this.delay = delay;
	}
	
	//@Override
	public void run()  {
		int val = 10;
		//synchronized ("hii") {
			
		try {
			//for (int i = 0; i < 5; i++) 
			for(int i=0; i<val; i++){
				System.out.println(message);
				//System.out.println(Thread.currentThread().getName());
				Thread.sleep(delay);
				System.out.println(i);
				System.out.println();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		}
//}
