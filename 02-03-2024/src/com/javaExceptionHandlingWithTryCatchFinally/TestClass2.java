package com.javaExceptionHandlingWithTryCatchFinally;

import java.util.Scanner;

public class TestClass2 {

	public static void main(String[] args) 
	{
		
		int x, y;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter values: ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		try
		{
			System.out.println(Example2.getOperataion(x, y));

		}
		catch (ArithmeticException e) 
		{
			System.err.println(e.getMessage());
		}
		finally 
		{
			scanner.close();
			System.out.println("compulsory block: fianlly");
		}

	}

}
