package com.javaInputReaders;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {

	public static void main(String[] args) throws IOException
	{
		//Scanner
		String name;
		
		//Scanner scanner = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			System.out.println("Enter your name");
			name = reader.readLine();
			System.out.println(name);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			reader.close();
		}		

	}

}
