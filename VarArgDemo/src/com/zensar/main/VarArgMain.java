package com.zensar.main;

import com.zensar.math.MathEngine;

public class VarArgMain {

	public static void main(String[] args) {
		MathEngine.add(10,20);
		MathEngine.add(10,20,30);
		MathEngine.add(10,20,30,40);
		MathEngine.add(10,20,30,40,50);
		int arr[]= {1,2,3,4,5};
		int arr2[]= {5,4,3,2,1};
		MathEngine.add(arr);
		MathEngine.add(arr2);

	}

}
