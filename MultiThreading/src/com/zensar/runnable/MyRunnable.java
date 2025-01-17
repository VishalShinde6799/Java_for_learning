package com.zensar.runnable;

public class MyRunnable implements Runnable {

	private String message;
	private long delay;

	public MyRunnable(String message, long delay) {
		super();
		this.message = message;
		this.delay = delay;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName());
				System.out.println(message +"\n");
				Thread.sleep(delay);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
