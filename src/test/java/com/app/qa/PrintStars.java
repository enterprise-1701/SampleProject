package com.app.qa;

public class PrintStars {

	public static void main(String args[]) {
		int x, y, rows = 5;
		// first loop prints rows
		for (x = 0; x < rows; x++) {
			System.out.println("x is " + x);
			// print columns
			for (y = 0; y <= x; y++) {
				System.out.println("y is " + y);
				//System.out.print("* ");
			}
			System.out.println();
		}

	}
}
