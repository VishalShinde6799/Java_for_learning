package com.zensar.products;

import com.zensar.util.Date;

//container object class
public class Product {
	private int productId;
	private String name;
	private String brand;
	private float price;
	
	//containment
	private Date mfgDate;
	
	public Product()
	{
		productId=1000;
		name="pqr";
		brand="abc";
		price=0.0f;
		mfgDate= new Date();
		
	}

	public Product(int productId, String name, String brand, float price, Date mfgDate) {
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.mfgDate = mfgDate;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price
				+ ", mfgDate=" + mfgDate + "]";
	}
	


}
