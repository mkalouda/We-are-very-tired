package com.class11;

public class HW8 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?
		
		int[] arr= { 200, 44, 594, 30, 6, 1, 4, 7, 34}; 
		
		int smallest = arr[0];
		int largest = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
			
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		
		System.out.println("The minimum number is " + smallest + " and the maximum number is " + largest);
		
		
	}
}
