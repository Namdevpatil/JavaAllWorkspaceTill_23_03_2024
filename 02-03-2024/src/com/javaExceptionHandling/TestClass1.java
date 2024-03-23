package com.javaExceptionHandling;

public class TestClass1 {

	public static void main(String[] args)
	{
		
		
		System.out.println("program started.");
		
		//statement-1
		Example1 example1 = new Example1();
		System.out.println(example1.getNumberOfChatcters("Hello"));

		//statement-2
		Example2 example2 = new Example2();
		System.out.println(example2.getDivision(300, 10));
		
		//statement-3
		Example3 example3 = new Example3();
		System.out.println(example3.getTheLetter("Kiran"));
		
		System.out.println("program ended.");
		
	}

}
