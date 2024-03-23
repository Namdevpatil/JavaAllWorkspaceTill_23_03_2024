package com.javaSerializationAndDeSerialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization 
{

	public static void main(String[] args) throws IOException
	{
		
		File file = new File("D:\\New folder\\Java Development\\Workspace\\IO\\javaObject3.txt");
		
		FileOutputStream outputStream = new FileOutputStream(file);
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		
		try
		{
			
			Student student = new Student(201, "Arun", 56.56f, 9034234561L);	
			
			objectOutputStream.writeObject(student);
						
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			objectOutputStream.close();
		}
		
		
	}

}
