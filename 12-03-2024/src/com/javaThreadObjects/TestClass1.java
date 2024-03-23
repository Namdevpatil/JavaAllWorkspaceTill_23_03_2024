package com.javaThreadObjects;

public class TestClass1 {

	public static void main(String[] args) {
		
		Example1 example1 = new Example1();
		example1.start();
		
		Example2 example2 = new Example2();
		example2.start();
		
		//example2.start();//it is not legal
		
		
	}

}
