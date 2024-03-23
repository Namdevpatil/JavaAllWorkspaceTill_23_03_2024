package com.javaFileHandlingOnCharacterData;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example5 
{
	
	public static void main(String[] args) throws IOException
	{
		
		
		File inputFile = new File("D:\\New folder\\Java Development\\Workspace\\IO\\hello1.txt");
		FileReader fileReader = new FileReader(inputFile);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		File outputFile = new File("D:\\New folder\\Java Development\\Workspace\\IO\\hello3.txt");
		FileWriter fileWriter = new FileWriter(outputFile);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		try
		{
			
			if(bufferedReader != null)
			{
				int i = 0;
				
				while((i = bufferedReader.read()) != -1)
				{
					bufferedWriter.write(i);
				}
				
				
			}
						
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			bufferedReader.close();
			bufferedWriter.close();
			
		}
		
		
	}

}
