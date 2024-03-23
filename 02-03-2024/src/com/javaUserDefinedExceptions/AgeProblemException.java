package com.javaUserDefinedExceptions;


//custom exception class
public class AgeProblemException extends Exception
{

	private static final long serialVersionUID = 1L;

	public AgeProblemException(String exceptionMessage) 
	{
		super(exceptionMessage);
	}
	
}
