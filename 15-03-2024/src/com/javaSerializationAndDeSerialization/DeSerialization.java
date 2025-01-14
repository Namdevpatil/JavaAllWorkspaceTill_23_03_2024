package com.javaSerializationAndDeSerialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization 
{

	public static void main(String[] args) throws IOException
	{
		
		File file = new File("D:\\New folder\\Java Development\\Workspace\\IO\\javaObject2.txt");
		
		FileInputStream fileInputStream = new FileInputStream(file);
		
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream); 
		
		try
		{
			
			Student student = (Student)objectInputStream.readObject();
			
			System.out.println(student.toString());
						
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			objectInputStream.close();
		}
		
		
	}

}
