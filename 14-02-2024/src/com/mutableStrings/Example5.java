package com.mutableStrings;

public class Example5 {

	public static void main(String[] args) {
		
		String text = "welcome to ists";
		
		String words[] = text.split("\\s");
		
		for(String word: words)
		{
			System.out.println(word);
		}
		
	}
	
}
