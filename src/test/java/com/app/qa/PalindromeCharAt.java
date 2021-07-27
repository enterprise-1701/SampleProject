package com.app.qa;

import java.util.Scanner;

public class PalindromeCharAt {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a String");
		String input = scanner.nextLine();
		String reverse = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			reverse = reverse + input.charAt(i);
		}

		if (input.equals("") | input.length()==1) {
			System.out.println("Invalid Input!");
		} else if (input.equals(reverse)) {
			System.out.println("This is a Palindrome");
		} else {
			System.out.println("This is NOT a Palindrome");
		}

		scanner.close();
	}

}
