package com.zensar.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.zensar.entities.Product;

public class SerializeProductTest {

	public static void main(String[] args) {
		try
		(
		  	ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("Product.dat"));	
		)
		{
		 Product p = new Product(1001, "mobile", "asus", 15500.0f);
		 oos.writeObject(p);
		 System.out.println("product object is serialized");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
