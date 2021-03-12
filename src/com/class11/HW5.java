package com.class11;

public class HW5 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable?
		
		int x=10;
		int y=5;
		
		x= x + y;
		y= x - y;
		x= x - y;
		
		System.out.println("Now x= " + x + " and y= " + y);
		

	}

}
