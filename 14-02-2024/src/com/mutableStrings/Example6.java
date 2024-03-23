package com.mutableStrings;

public class Example6 {
	public static void main(String[] args) {
		String text="Welcome to ISTS";
		char words[]= text.toCharArray();
		int upperCase=0;
		int lowerCase=0;


		for(char word:words)
		{
			if(Character.isUpperCase(word))
			{
				upperCase++;

			}
			else if(Character.isLowerCase(word)) 
			{
				lowerCase++;
			}
		}

		System.out.println(upperCase);
		System.out.println(lowerCase);

	}

}
