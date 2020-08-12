package com.zensar.entities;

public class Product implements Comparable<Product> {
	
	private int productId;
	private String name;
	private String brand;
	private float price;
	
	public Product() 
	{	
		productId = 0;	
	}

	
	public Product(int productId, String name, String brand, float price) {
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
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


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}


	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		/*
		 * if(this.productId>o.productId) return 1; else if(this.productId<o.productId)
		 * return -1; else return 0;
		 */
		
		return (this.productId>o.productId)?1:-1;
	}

	
	public boolean equals(Object o) 
	{
		if (o instanceof Product) 
		{
			Product p = (Product) o;
			if (this.productId == p.productId && this.name.equals(p.name) && this.brand.equals(p.brand) && this.price == p.price)
				return true;
			else
				return false;
		}
		return false;
	}
	
	public int hashCode()
	{
		return productId+ name.hashCode()+brand.hashCode();
	}
	

}
