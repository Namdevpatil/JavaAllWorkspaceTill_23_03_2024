package com.javaFileHandlingOnCharacterData;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example4 
{
	
	public static void main(String[] args) throws IOException
	{
		
		
		File inputFile = new File("D:\\New folder\\Java Development\\Workspace\\IO\\hello1.txt");
		FileReader fileReader = new FileReader(inputFile);

		File outputFile = new File("D:\\New folder\\Java Development\\Workspace\\IO\\hello2.txt");
		FileWriter fileWriter = new FileWriter(outputFile);
		
		
		try
		{
			
			if(fileReader != null)
			{
				int i = 0;
				
				while((i = fileReader.read()) != -1)
				{
					fileWriter.write(i);
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
			fileWriter.close();
			
		}
		
		
	}

}
