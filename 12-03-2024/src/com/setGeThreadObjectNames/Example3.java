package com.setGeThreadObjectNames;

public class Example3 extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.println(i+" :"+Thread.currentThread().getName());
			try
			{
				Thread.sleep(1000);				
			}
			catch (Exception e) 
			{
				
			}
		}
	}
	
}
