package com.ists.javaBasics;

public class Product {

	private int productId;
	private String productName;
	private double productPrice;
	
	public Product() //default constructor
	{
		productId = 201;
		productName = "Iphone 13";
		productPrice = 120592.23;
	}
	
	public Product(int productId, String productName, double productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	@Override
	public String toString() 
	{
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}	
	
}
