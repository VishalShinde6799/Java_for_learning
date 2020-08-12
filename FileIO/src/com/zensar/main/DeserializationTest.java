package com.zensar.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.zensar.entities.Product;

public class DeserializationTest {

	public static void main(String[] args) {
		try
		(
			ObjectInputStream ois = new ObjectInputStream( new FileInputStream("Product.dat"));	
		)
		{
			Product p = (Product) ois.readObject();
			System.out.println(p);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
