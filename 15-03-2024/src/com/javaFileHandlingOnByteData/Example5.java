package com.javaFileHandlingOnByteData;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example5 
{
	
	public static void main(String[] args) throws IOException
	{
		
		
		File inputFile = new File("D:\\New folder\\Java Development\\Workspace\\IO\\java1.txt");
		FileInputStream inputStream = new FileInputStream(inputFile);
		BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
		
		File outputFile = new File("D:\\New folder\\Java Development\\Workspace\\IO\\java3.txt");
		FileOutputStream outputStream = new FileOutputStream(outputFile);
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
		
		try
		{
			
			if(bufferedInputStream != null)
			{
				int i = 0;
				
				while((i = bufferedInputStream.read()) != -1)
				{
					bufferedOutputStream.write(i);
				}
				
				
			}
						
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			bufferedInputStream.close();
			bufferedOutputStream.close();
			
		}
		
		
	}

}
