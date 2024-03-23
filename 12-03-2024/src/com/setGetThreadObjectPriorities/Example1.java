package com.setGetThreadObjectPriorities;

public class Example1 extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.println(i+" :"+Thread.currentThread());
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
