package com.class11;

public class HW2 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array or integer type where you will store odd and even numbers
		 * in 3 rows and 4 columns. Develop a program which will identify/print the even
		 * numbers only.
		 */

		int[][] numbers = {

				{ 20, 45, 34, 11 }, { 80, 86, 81, 76 }, { 9, 7, 5, 1 }, };

		for (int[] num : numbers) {

			for (int value : num) {
				if (value % 2 == 0) {
					System.out.print(value + " ");
				}
			}
		}

	}

}
