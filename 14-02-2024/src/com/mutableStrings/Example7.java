package com.mutableStrings;

public class Example7 {
	public static void main(String[] args) {
		String text="Welcome to ISTS";
		char words[]= text.toCharArray();
		

		//for(char word:words)
		for(int i = 0; i < words.length; i++)
		{
			if(Character.isUpperCase(words[i]))
			{
				
				//System.out.println(words[i]);
			}
			else if(Character.isLowerCase(words[i])) 
			{
				System.out.println(words[i]);
			}
		}

		

	}

}
