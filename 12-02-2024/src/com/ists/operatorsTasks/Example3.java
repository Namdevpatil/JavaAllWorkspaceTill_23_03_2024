package com.ists.operatorsTasks;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {

		int size;

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter size of an array: ");
		size = scanner.nextInt();

		int values[] = new int[size];

		int result=0;

		int data[] = new int[size];



		System.out.println("enter array values: ");

		for(int i = 0; i < size; i++)
		{
			values[i] = scanner.nextInt();
		}

		scanner.close();

		for(int i = 0; i<size; i++)
		{
			if(values[i]%3==0 && values[i]%5==0)
			{
				data[result] = values[i];
				result++;
			}

		}

		//sorting
		for(int i = 0; i < size; i++)
		{
			System.out.println(data[i]);
		}

	}

}
