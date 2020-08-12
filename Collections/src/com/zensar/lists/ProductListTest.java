package com.zensar.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.zensar.entities.Product;
import com.zensar.util.ProductNameComparator;

public class ProductListTest {
	
	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<Product>();
		
		products.add(new Product(101, "comp", "hp", 50000));
		products.add(new Product(102, "tref", "dell", 10000));
		products.add(new Product(103, "refr", "whirl", 20000));
		products.add(new Product(104, "refre", "whirlpool", 30000));
		products.add(new Product(105, "refreg", "LG", 40000));
		products.add(new Product(102, "ref", "dell", 20000));
		
		for(Product p: products)
			System.out.println(p);
		
		Collections.reverse(products);
		
		System.out.println("after reversing:: ");
		for(Product p1: products)
			System.out.println(p1);
		
		System.out.println("sorted list is:: \n");
		Collections.sort(products );
		for (Product p2 : products) {
			System.out.println(p2);
			
		}
		
		Comparator<Product> c = Collections.reverseOrder();
		Collections.sort(products, c);
		System.out.println("after sorted reversing");
		for (Product product : products) {
			System.out.println(product);
			
		}
		
		Comparator<Product> cName = new ProductNameComparator();
		Collections.sort(products , cName);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
		System.out.println();
		for (Product product : products) 
			System.out.println(product);
		
		Comparator<Product> cNameRev = Collections.reverseOrder(cName);
		Collections.sort(products , cNameRev);
		System.out.println("\nreverse sorting:: \n");
		System.out.println();
		for (Product product : products) 
			System.out.println(product);
		
	}

}
