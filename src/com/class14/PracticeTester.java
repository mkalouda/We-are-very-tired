package com.class14;

public class PracticeTester {

	public static void main(String[] args) {
		
		Practice practice = new Practice();
		
		practice.print5times();
		
		System.out.println(practice.greaterNumber(5, 45));
		
		practice.printEvenOdd(0);
		
		int [] arr = {10, 5, 2, 6};
		System.out.println(practice.returnTheArraySum(arr));
		
		System.out.println(practice.isMirror("abcd"));

	}

}
