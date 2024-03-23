package com.operationsOnThreadObjects;

public class Example3 extends Thread
{
	public void run()
	{
		for(int i = 21; i <= 31; i++)
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
