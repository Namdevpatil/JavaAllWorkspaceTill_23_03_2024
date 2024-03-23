package com.javaFileHandlingOnCharacterData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Example2 
{
	
	public static void main(String[] args) throws IOException
	{
		
		String text = " Welcome to HYDERABAD";		
		
		File file = new File("D:\\New folder\\Java Development\\Workspace\\IO\\hello1.txt");
		
		FileWriter fileWriter = new FileWriter(file, true);
				
		try
		{
			
			if(fileWriter != null)
			{
				fileWriter.write(text);
			}
						
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			fileWriter.close();
		}
		
		
	}

}
