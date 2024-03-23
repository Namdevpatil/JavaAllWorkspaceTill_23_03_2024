package com.javaFileHandlingOnByteData;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 
{
	
	public static void main(String[] args) throws IOException
	{
		
		String text = "Welcome to ISTS";		
		
		File file = new File("D:\\New folder\\Java Development\\Workspace\\IO\\java1.txt");
		
		FileOutputStream outputStream = new FileOutputStream(file, true);
				
		try
		{
			
			if(outputStream != null)
			{
				byte characters[] = text.getBytes();
				outputStream.write(characters);
			}
						
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			outputStream.close();
		}
		
		
	}

}
