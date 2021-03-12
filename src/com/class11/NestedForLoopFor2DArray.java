package com.class11;

public class NestedForLoopFor2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] numbers= {
				
				{10, 20, 30, 40},
				{90, 80},
				{1, 2, 3, 4, 5, 6, 7},
		};
		
		System.out.println(numbers.length);   //3
		System.out.println(numbers[1].length); //2
		
		System.out.println("------------------------------------------");
		
		for (int row=0; row<numbers.length; row++) {
			for (int col=0; col<numbers[row].length; col++) {
				System.out.print(numbers[row][col]+" ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
		
		for(int[] num:numbers) {
			for(int values:num) {
				System.out.print(values+" ");
			}
			System.out.println();
		}


	}

}
