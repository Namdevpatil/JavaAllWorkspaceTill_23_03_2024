package com.mutableStrings;

public class Example1 {

	public static void main(String[] args) {
		String str = "Hello";
		
		str.concat(" Guys...!");
		
		System.out.println(str);
		
		System.out.println("====================");

		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append(" Guys...!");
		
		System.out.println(buffer);
		
		System.out.println("====================");

		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" Buddies...!");
		
		System.out.println(builder);
		
	}

}
