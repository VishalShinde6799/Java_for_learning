package com.zensar.main;

import com.zensar.products.Product;
import com.zensar.util.Date;


//co-variant
public class DeepCopyingTest {
	public static void main(String[] args) {
		
		Product p= new Product(2003, "vishi", "hp", 10000, new Date(12, 8, 2019));
		System.out.println("original Product object:: "+p);
		
			try {
				
				//Product pCopy= (Product) p.clone();
				Product pCopy= p.clone();
				Date mfgDate= p.getMfgdate();
				
				//create clone of mfgDate from p.
				// Date mfgDateCopy= (Date) mfgDate.clone();
				Date mfgDateCopy=  mfgDate.clone();
				pCopy.setMfgdate(mfgDateCopy);//deep copy
				
				System.out.println("copy is:: " +pCopy);
				pCopy.getMfgdate().setYear(2018);
				System.out.println("the mfg of clone is: "+pCopy.getMfgdate());
				System.out.println("copy is:: \n" +pCopy);
				System.out.println("original Product object after deep cloning and changing the clone::\n"+p);
				
				//Product pCopyTwo= (Product) pCopy.clone();
				//System.out.println("copy of copy is::" +pCopyTwo);
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
				//e.printStackTrace();
			}
		
		
	}

}
