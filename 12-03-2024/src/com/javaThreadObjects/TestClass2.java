package com.javaThreadObjects;

public class TestClass2 {

	public static void main(String[] args) {
		
		Example3 example3 = new Example3();
		Thread thread3 = new Thread(example3);
		
		thread3.start();
		
		Example4 example4 = new Example4();
		Thread thread4 = new Thread(example4);
		
		thread4.start();		
		
	}

}
