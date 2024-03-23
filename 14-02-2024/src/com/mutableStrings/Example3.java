package com.mutableStrings;

public class Example3 {

	public static void main(String[] args) {
		
		String text = "welcome to ists";
		
		byte bytes[] = text.getBytes();
		
		for(byte byteValue: bytes)
		{
			System.out.println(byteValue);
		}
	}
	
}
