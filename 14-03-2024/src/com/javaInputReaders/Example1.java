package com.javaInputReaders;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) 
	{
		//Scanner
		String name;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name");
		name = scanner.nextLine();
		
		scanner.close();
		
		System.out.println(name);

	}

}
