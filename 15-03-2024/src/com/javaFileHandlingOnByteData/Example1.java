package com.javaFileHandlingOnByteData;

import java.io.File;

public class Example1 
{
	
	public static void main(String[] args) 
	{
		
		//String text = "Welcome to Hyderabad";
		
		File file = new File("D:\\New folder\\Java Development\\Workspace\\IO\\java.txt");
		
		boolean status = file.exists();
		
		if(status)
		{
			System.out.println(status+" file exists");
		}
		else
		{
			System.out.println(status+" file not exists");
		}
		
	}

}
