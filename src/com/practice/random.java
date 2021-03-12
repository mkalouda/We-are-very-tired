package com.practice;

public class random {

	public static void main(String[] args) {

		int[] arr= {34,5,23,77,545,32,-4};
		
		int largest = arr[0];
		int smallest = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
			
			if(arr[i]<smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("min is " + smallest+ " and " + " max is " + largest);
	}

}
