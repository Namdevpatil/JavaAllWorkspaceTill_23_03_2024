package com.threadsWithSynchronization;

public class Example1 extends Thread
{
	
	ThreadOperations operations;
	
	public Example1(ThreadOperations operations) 
	{
		this.operations = operations;
	}

	public void run()
	{
		operations.getOperation();		
	}
	
}
