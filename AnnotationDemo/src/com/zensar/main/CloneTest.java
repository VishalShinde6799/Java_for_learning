package com.zensar.main;

import com.zensar.products.Product;

public class CloneTest  {

	public static void main(String[] args)  {
		
		Product p= new Product(2003, "vishi", "hp", 10000);
		System.out.println("original Product object:: "+p);
		
			try {
				Product pCopy= (Product) p.clone();
				Product pCopyTwo= (Product) pCopy.clone();
				
				System.out.println("copy is:: " +pCopy);
				System.out.println("copy of copy is::" +pCopyTwo);
				
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
				//e.printStackTrace();
			}
		

	}

}
