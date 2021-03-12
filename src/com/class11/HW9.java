package com.class11;

public class HW9 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?
		
		int[] arr= { 200, 44, 594, 30, 6, 200, 1, 4, 594, 7, 34};
		
		int largest;
		int secondLargest;
		
		largest = 0;
		secondLargest= 0;
		
		for (int i=0; i<arr.length; i++) {
			
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			
			}else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		
		System.out.println("The second largest number is " + secondLargest);
		
		

	}

}
