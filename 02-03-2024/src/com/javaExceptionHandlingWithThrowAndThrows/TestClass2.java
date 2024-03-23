package com.javaExceptionHandlingWithThrowAndThrows;

public class TestClass2 {

	public static void main(String[] args) {
		
		
		Example2 example2 = new Example2();
		
		try
		{
			System.out.println(example2.getOperataion(100, 0));
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
