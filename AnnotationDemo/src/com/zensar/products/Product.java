package com.zensar.products;

import com.zensar.utilities.CopyrightInfo;
@CopyrightInfo(author = "vishal", version = 1.0,copyright = "ZENSAR TECHNOLOGIES, INDIA",description = "IT REPRESENTS PRODUCT ENTITY" )
public class Product implements Cloneable {
	@CopyrightInfo(author ="vishi", copyright = "clg", description = "abc", version = 2)
	private int productId;
	private String name;
	private String brand;
	double price;
	
	public Product() {
		productId=10;
		name= "vishi";
		brand="aaa";
		price=1000;
	}
	
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
	public Product(int productId, String name, String brand, double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
	@CopyrightInfo(author = "vishal", version = 1.0,copyright = "ZENSAR TECHNOLOGIES, INDIA",description = "IT RETURNS PRODUCT ID" )
	public int getProductId() {
		return productId;
	}
	@CopyrightInfo(author = "vishal", version = 1.0,copyright = "ZENSAR TECHNOLOGIES, INDIA",description = "IT SETS ID TO PRODUCT" )
	public void setProductId(int productId) {
		this.productId = productId;
	}
	@CopyrightInfo(author = "vishal", version = 1.0,copyright = "ZENSAR TECHNOLOGIES, INDIA",description = "IT RETURNS NAME OF PRODUCT" )
	public String getName() {
		return name;
	}
	@CopyrightInfo(author = "vishal", version = 1.0,copyright = "ZENSAR TECHNOLOGIES, INDIA",description = "IT SETS PRODUCT NAME" )
	public void setName(String name) {
		this.name = name;
	}
	@CopyrightInfo(author = "vishal", version = 1.0,copyright = "ZENSAR TECHNOLOGIES, INDIA",description = "IT RETURNS BRAND" )
	public String getBrand() {
		return brand;
	}
	@CopyrightInfo(author = "vishal", version = 1.0,copyright = "ZENSAR TECHNOLOGIES, INDIA",description = "IT SETS BRAND" )
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@CopyrightInfo(author = "vishal", version = 1.0,copyright = "ZENSAR TECHNOLOGIES, INDIA",description = "IT RETURNS PRICE" )
	public double getPrice() {
		return price;
	}
	@CopyrightInfo(author = "vishal", version = 1.0,copyright = "ZENSAR TECHNOLOGIES, INDIA",description = "IT SETS A PRICE VALUE" )
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

	
}
