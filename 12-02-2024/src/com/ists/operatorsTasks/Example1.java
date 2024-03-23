package com.ists.operatorsTasks;

public class Example1 
{
	public static void main(String[] args) 
	{		
		int a = 5, b = 6;
		
		int expression1 = a++ - a + b-- + ++b + b;
						//5 - 6 + 6 + 6 + 6;
						//17
		
		System.out.println(expression1);		
	}
}
