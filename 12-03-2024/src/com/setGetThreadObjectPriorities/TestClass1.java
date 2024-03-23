package com.setGetThreadObjectPriorities;

public class TestClass1 {

	public static void main(String[] args) {
		
		Example1 example1 = new Example1();
		example1.setName("Dolly - Example1");
		example1.setPriority(Thread.MAX_PRIORITY);
		example1.start();
		
		Example2 example2 = new Example2();
		example2.setName("Rani - Example2");
		example2.setPriority(Thread.MIN_PRIORITY);
		example2.start();
		
		Example3 example3 = new Example3();
		example3.setName("Kiran - Example3");
		example3.setPriority(Thread.MAX_PRIORITY);
		example3.start();		
		
	}

}
