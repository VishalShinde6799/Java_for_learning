package com.zensar.entities;

import java.io.Serializable;

public class Product implements Serializable {
	private transient int productId;  //transient things don't get serialized.
	private String name;
	private transient String brand;
	private float price;
	
	public Product() {
		System.out.println("default of Product");
	}

	public Product(int productId, String name, String brand, float price) {
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
		System.out.println("parameterised of Product");
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
}
