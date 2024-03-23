package com.javaUserDefinedExceptions;

import java.util.Scanner;


public class TestClass {

	public static void main(String[] args) 
	{


		int personAge;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter person age: ");
		personAge = scanner.nextInt();

		try
		{
			AgeValidation.validatePersonAge(personAge);
		}
		catch (AgeProblemException e) 
		{
			//System.err.println(e.getMessage());
			e.printStackTrace();
		}
		finally 
		{
			scanner.close();
		}

	}

}
