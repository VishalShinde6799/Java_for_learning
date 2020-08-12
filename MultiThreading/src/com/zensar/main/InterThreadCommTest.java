package com.zensar.main;

import com.zensar.data.Data;
import com.zensar.threads.CalculatorThread;
import com.zensar.threads.TotalReaderThread;

public class InterThreadCommTest {
	
	public static void main(String[] args) {
		int arr[] = new int[args.length];
		for(int i = 0; i<arr.length; i++)
		{
			arr[i]= Integer.parseInt(args[i].trim());
		}
		Data data = new Data();
		data.setArr(arr);
		TotalReaderThread t1 = new TotalReaderThread(data);
		CalculatorThread c1 = new CalculatorThread(data);
		t1.start();
		c1.start();
	}

}
																													