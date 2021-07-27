package com.app.qa;

public class ReverseString {

	public static void main(String[] args) {
		String input = "adjust";
		char[] chars = input.toCharArray();
		
		for(int i = chars.length-1; i>=0; i--) {
			System.out.print(chars[i]);
		}
	}
}
