package com.zensar.main;

import com.zensar.accounts.Account;
import com.zensar.threads.ATMThread;

public class ATMTest {
	
	public static void main(String[] args) {
		Account ac = new Account(12345, "Ms. Cutie", 100000);
		ATMThread husband = new ATMThread(ac, 10000, true);
		ATMThread wife = new ATMThread(ac, 40000, false);
		ATMThread child = new ATMThread(ac, 10000, true);
		Thread t1 = new Thread(husband);
		Thread t2 = new Thread(wife);
		Thread t3 = new Thread(child);
		t1.setName("HUSBAND");
		t2.setName("WIFE");
		t3.setName("CHILD");
		t2.start();
		t1.start();
		t3.start();
		System.out.println();

	}

}
