package com.javaExceptionHandling;

public class TestClass3 {

	public static void main(String[] args)
	{
		
		
		System.out.println("program started.");
		
		//statement-1
		Example1 example1 = new Example1();
		
		//Exception Handling
		try//problematic part
		{
			System.out.println(example1.getNumberOfChatcters(null));
		}
		catch(Exception e)//handler part
		{
			e.printStackTrace();
		}

		//statement-2
		Example2 example2 = new Example2();
		
		try//problematic part
		{
			System.out.println(example2.getDivision(300, 0));
		}
		catch(Exception e)//handler part
		{
			e.printStackTrace();
		}
		
		//statement-3
		Example3 example3 = new Example3();		
		try//problematic part
		{
			System.out.println(example3.getTheLetter(null));
		}
		catch(Exception e)//handler part
		{
			e.printStackTrace();
		}
		
		System.out.println("program ended.");
		
	}

}
