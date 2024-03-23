package com.ists.javaBasics;

public class Example2 {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		System.out.println(product1.toString());
		System.out.println(product1.hashCode());
		
		Product product2 = new Product();
		System.out.println(product2.toString());
		System.out.println(product2.hashCode());

	}

}
