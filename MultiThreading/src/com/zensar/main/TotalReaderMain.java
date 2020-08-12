package com.zensar.main;

import com.zensar.data.Data;
import com.zensar.threads.CalculatorThread;
import com.zensar.threads.TotalReaderThread;

public class TotalReaderMain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[3];
		for(int i = 1;i<=3;i++)
		{
			a[i-1] = i;
		}
		Data data = new Data();
		data.setArr(a);
	 	Thread t1 = new TotalReaderThread(data);
	 	Thread c1 = new CalculatorThread(data);
		t1.start();
		c1.start();
	}

}
