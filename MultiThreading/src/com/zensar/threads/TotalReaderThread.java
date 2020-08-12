package com.zensar.threads;

import com.zensar.data.Data;

public class TotalReaderThread extends Thread {
	private Data data;
	
	public TotalReaderThread() {
		// TODO Auto-generated constructor stub
	}

	public TotalReaderThread(Data data) {
		super();
		this.data = data;
	}
	
	@Override
	public void run() {
		synchronized (data) {
			try {
				System.out.println("waiting to get total");
				data.wait();
				System.out.println("wait over");
				int total = data.getTotal();
				System.out.println("the total is:: " + total);
			} catch (InterruptedException e) {
				 //TODO Auto-generated catch block
			 e.printStackTrace();
			}
		}

	}

}
