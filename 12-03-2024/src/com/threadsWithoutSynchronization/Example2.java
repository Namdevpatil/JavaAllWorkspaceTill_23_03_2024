package com.threadsWithoutSynchronization;

public class Example2 extends Thread
{
	ThreadOperations operations;

	public Example2(ThreadOperations operations) 
	{
		this.operations = operations;
	}

	public void run()
	{
		operations.getOperation();		
	}

}
