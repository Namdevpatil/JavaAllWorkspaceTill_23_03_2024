package com.javaFileHandlingOnCharacterData;

import java.io.File;

public class Example1 
{
	
	public static void main(String[] args) 
	{
		
		//String text = "Welcome to Hyderabad";
		
		File file = new File("D:\\New folder\\Java Development\\Workspace\\IO\\hello1.txt");
		
		boolean status = file.exists();
		
		if(status)
		{
			System.out.println("file is exists");
		}
		else
		{
			System.out.println("file is not exists");
		}
		
	}

}
