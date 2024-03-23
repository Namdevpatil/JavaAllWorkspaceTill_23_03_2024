package com.operationsOnThreadObjects;

public class Example2 extends Thread
{
	public void run()
	{
		for(int i = 32; i <= 42; i++)
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
