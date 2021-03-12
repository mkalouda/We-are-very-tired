package com.class11;

public class HW3 {

	public static void main(String[] args) {
		/*Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns. 
		 * Develop a program which will identify/print the even numbers only.
		 */
		
		int even=0;
		int odd=0;
		
		int[][] numbers= {
				
				{11, 12, 55, 6},
				{8, 43, 33, 22},
				{9, 10, 13, 2},
		};
		
		for (int[] num:numbers) {
			for(int value:num) {
				if(value%2==0) {
					even+=value;
					
				}else {
					odd+=value;
					
				}
			}
		}
		System.out.println("The sum of all even numbers is "+ even);
		System.out.println("The sum of all odd numbers is "+ odd);
		
	

	}

}
