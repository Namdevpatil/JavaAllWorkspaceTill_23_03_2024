package com.javaExceptionHandlingWithThrowAndThrows;

public class Example1
{
	public char getLetter(String text, int index) throws StringIndexOutOfBoundsException
	{
		return text.charAt(index);
	}
}
