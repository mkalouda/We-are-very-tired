package com.class03;

public class HW {
	
	public static void main (String[] args) {
		
		int num=23;
		
		if (num<0) {
			System.out.println("This is a negative number");
		}else {
			System.out.println("This is a positive number");
		}
		
		System.out.println("------------------------------------------");
		
		int negativeOrPositive=0;
		
		if (negativeOrPositive>0) {
			System.out.println(negativeOrPositive+ " is positive number");
		}else if (negativeOrPositive<0) {
			System.out.println(negativeOrPositive+" is a negative number");
		}else {
			System.out.println("Number us neither negative or positive");
		}
		
		System.out.println("-------------------------------------------");
		
		int n1=7;
		
		if (n1%2==0) {
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");
		}
			
	
		System.out.println("-------------------------------------------");
			
			
		if (n1%2!=0) {
				System.out.println("number is odd");
		}else {
				System.out.println("number is even");	
				
				
		}
	}

}
