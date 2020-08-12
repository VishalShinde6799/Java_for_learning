package com.zensar.threads;

import com.zensar.accounts.Account;

public class ATMThread implements Runnable {
	private Account ac;
	private double amount;
	private boolean flag;
	
	public ATMThread() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		try {
			if(flag==true)
				ac.withdraw(amount);
			else
				ac.withdraw(amount);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	public ATMThread(Account ac, double amount, boolean flag) {
		super();
		this.ac = ac;
		this.amount = amount;
		this.flag = flag;
	}
	
	

}
