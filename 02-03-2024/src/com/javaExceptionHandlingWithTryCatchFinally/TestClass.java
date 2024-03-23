package com.javaExceptionHandlingWithTryCatchFinally;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) 
	{
		
		String text;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any text message: ");
		text = scanner.nextLine();
		
		try
		{
			System.out.println(Example1.getStringLength(text));
		}
		catch (NullPointerException e) 
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
