package com.ists.roshi;

public class Laptop {
	String brandName;
	String model;
	String configuration;
	double price;
	
	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public Laptop(String brandName, String model, String configuration, double price) {
		super();
		this.brandName = brandName;
		this.model = model;
		this.configuration = configuration;
		this.price = price;
	}
	
	public void getLaptopDetails() {
		System.out.println(brandName);
		System.out.println(model);
		System.out.println(configuration);
		System.out.println(price);
		
		
	}
	

}
