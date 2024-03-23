package com.javaUserDefinedExceptions;

public class AgeValidation 
{
	
	public static void validatePersonAge(int age)throws AgeProblemException
	{
		if(age >= 18)
		{
			System.out.println("the person able to cast the vote.");
		}
		else
		{
			throw new AgeProblemException("the person not have suffient age.");
		}
	}

}
