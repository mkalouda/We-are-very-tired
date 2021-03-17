package com.class14;

public class Practice {
	
	/*
	 * write a method that print batch 9 is great
	 * 5 times
	 */
	
	void print5times() {
		for (int i=0;i<5;i++) {
			System.out.println("Batch 9 is great");
		}
	}
	
	/*
	 * create a method that takes 2 numbers as input and 
	 * return the greater number
	 */
	
	int greaterNumber(int num1, int num2) {
		
		if(num1>num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	/*
	 * create a method that takes a number if number is 
	 * even print number is even otherwise print number is odd
	 */
	
	void printEvenOdd (int num) {
		
		if(num%2==0 || num==0) {
			System.out.println(num+ " is even number");
		}else {
			System.out.println(num+ " is odd number");
		}
			
	}
	
	/*
	 * write a method that takes an array and returns the
	 * sum of the elements that are present in the array
	 */
	
	int returnTheArraySum (int[] arr) {
		
		int sum=0;
		
		for(int element:arr) {
			sum+=element;
		}
		
		return sum;
	}
	
	/*
	 * is the string a mirror of itself
	 * aba - yes
	 * bbb - yes
	 * bba - yes
	 */
	
	boolean isMirror (String str) {
		String newStr ="";
		
		for (int i=str.length()-1; i>=0; i--) {
			newStr+=str.charAt(i);
		}
		System.out.println(newStr);
		
		if(str.equals(newStr)) {
			return true;
		}else {
			return false;
		}
		
	}

}
