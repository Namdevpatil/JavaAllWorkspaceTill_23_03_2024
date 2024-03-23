package com.ists.operatorsTasks;

public class Example2 
{
	public static void main(String[] args) 
	{		
		int a = 15, b = 5;
		
		int expression1 = ++a - a * b-- - ++b + a++ / b;
						//16 - 16 * 5 - 5 + 16 / 5; 
						//-66
		
		System.out.println(expression1);		
	}
}
