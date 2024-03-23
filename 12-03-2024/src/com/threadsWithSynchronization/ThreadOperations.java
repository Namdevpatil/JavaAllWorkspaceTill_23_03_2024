package com.threadsWithSynchronization;

public class ThreadOperations 
{
	
	public synchronized void getOperation()
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
