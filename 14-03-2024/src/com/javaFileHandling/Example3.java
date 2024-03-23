package com.javaFileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Example3 
{
	
	public static void main(String[] args) throws IOException
	{
		
		
		File file = new File("D:\\New folder\\Java Development\\Workspace\\IO\\java1.txt");
		
		//FileOutputStream outputStream = new FileOutputStream(file, true);
		
		FileInputStream inputStream = new FileInputStream(file);
		
		try
		{
			
			if(inputStream != null)
			{
				int i = 0;
				
				while((i = inputStream.read()) != -1)
				{
					System.out.print((char)i);
				}
				
				
			}
						
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			inputStream.close();
		}
		
		
	}

}
