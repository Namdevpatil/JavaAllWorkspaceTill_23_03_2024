package com.javaExceptionHandlingWithThrowAndThrows;

public class Example2
{
	//method
	public int getOperataion(int a, int b) throws ArithmeticException
	{
		if(b == 0)
		{
			throw new ArithmeticException("divide by zero operation not posible");
		}
		else
		{
			return a/b;
		}
			
	}
}
