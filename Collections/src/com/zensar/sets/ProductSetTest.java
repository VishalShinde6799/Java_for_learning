package com.zensar.sets;


import java.util.HashSet;
import java.util.Set;

import com.zensar.entities.Product;

public class ProductSetTest {

	public static void main(String[] args) {
		
Set<Product> products = new HashSet<Product>();
		
		products.add(new Product(101, "comp", "hp", 50000));
		products.add(new Product(102, "ref", "dell", 10000));
		products.add(new Product(103, "refr", "dell", 20000));
		products.add(new Product(104, "refre", "whirlpool", 30000));
		products.add(new Product(105, "refreg", "LG", 40000));
		products.add(new Product(102, "ref", "dell", 10000));
		
		for (Product product : products) {
			System.out.println(product);
			
		}
	}
}
