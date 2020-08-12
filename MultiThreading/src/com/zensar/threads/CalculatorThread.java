package com.zensar.threads;

import com.zensar.data.Data;

public class CalculatorThread extends Thread {

	private Data data;

	public CalculatorThread() {
		// TODO Auto-generated constructor stub
	}

	public CalculatorThread(Data data) {
		super();
		this.data = data;
	}

// run cannot be synchronized under any circumstances
	@Override
	public void run() {

		synchronized (data) {
			try {
				int arr[] = data.getArr();
				int total = 0;

				
				for (int i : arr) {
					total += i;
				}
				Thread.sleep(1000);
				data.setTotal(total);
				System.out.println("Total calculated\n");
				data.notify();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
