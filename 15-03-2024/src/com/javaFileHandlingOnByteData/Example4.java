package com.javaFileHandlingOnByteData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example4 
{
	
	public static void main(String[] args) throws IOException
	{
		
		
		File inputFile = new File("D:\\New folder\\Java Development\\Workspace\\IO\\java1.txt");
		FileInputStream inputStream = new FileInputStream(inputFile);

		File outputFile = new File("D:\\New folder\\Java Development\\Workspace\\IO\\java2.txt");
		FileOutputStream outputStream = new FileOutputStream(outputFile);
		
		
		try
		{
			
			if(inputStream != null)
			{
				int i = 0;
				
				while((i = inputStream.read()) != -1)
				{
					outputStream.write(i);
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
			outputStream.close();
			
		}
		
		
	}

}
