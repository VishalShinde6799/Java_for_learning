package com.zensar.products;

import com.zensar.util.Date;

public class Product implements Cloneable {
	
	private int productId;
	private String name;
	private String brand;
	double price;
	private Date mfgdate= new Date();
	
	public Date getMfgdate() {
		return mfgdate;
	}


	public void setMfgdate(Date mfgdate) {
		this.mfgdate = mfgdate;
	}


	public Product() {
		productId=10;
		name= "vishi";
		brand="aaa";
		price=1000;
		
	}
	
	
	public Product(int productId, String name, String brand, double price, Date mfgdate) {
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.mfgdate = mfgdate;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price
				+ ", mfgdate=" + mfgdate + "]";
	}


	public int getProductId() {
		return productId;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Product clone() throws CloneNotSupportedException
	{
		return (Product)super.clone();
	}

	
}
