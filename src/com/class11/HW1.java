package com.class11;

public class HW1 {

	public static void main(String[] args) {
		//Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.
		
		
		int sum=0;
		
		int[][] numbers= {
				
				{44, 55, 66},
				{0, 88, 34},
				{23, 32, 44},
		};
		
		for(int[] num:numbers) {
			
			for(int value:num) {
				sum+=value;
			}
		}
		System.out.println("The sum of all the numbers is " + sum);

	}

}
