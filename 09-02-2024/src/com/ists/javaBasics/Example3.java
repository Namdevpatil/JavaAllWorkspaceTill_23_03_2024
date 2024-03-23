package com.ists.javaBasics;

public class Example3 {

	public static void main(String[] args) {
		
		Product product10 = new Product(202, "A1", 93738.34);
		System.out.println(product10.toString());
		System.out.println(product10.hashCode());
		
		Product product20 = new Product(203, "B1", 67353.34);
		System.out.println(product20.toString());
		System.out.println(product20.hashCode());

	}

}
