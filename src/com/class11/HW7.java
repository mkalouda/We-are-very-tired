package com.class11;

public class HW7 {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series.
		
		int a=0;
		int b=1;
		int c;
		
		for (int i=1; i<=10; i++) {
			
			System.out.print(a+" ");
			
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println();
		System.out.println("------------------------------------------");
		
		int f1=0;
		int f2=1;
		
		for (int i=1; i<=10; i++) {
			
			System.out.print(f1+" ");
			
			f1=f1+f2;
			f2=f1-f2;
		}
	}

}
