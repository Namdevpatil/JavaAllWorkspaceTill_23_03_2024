package com.javaFileHandlingOnCharacterData;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Example3 
{
	
	public static void main(String[] args) throws IOException
	{
		
		
		File file = new File("D:\\New folder\\Java Development\\Workspace\\IO\\hello1.txt");
		
		FileReader fileReader = new FileReader(file);
		
		try
		{
			
			if(fileReader != null)
			{
				int i = 0;
				
				while((i = fileReader.read()) != -1)
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
			fileReader.close();
		}
		
		
	}

}
