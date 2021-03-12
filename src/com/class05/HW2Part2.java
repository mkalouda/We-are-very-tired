package com.class05;

import java.util.Scanner;

public class HW2Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		double num1, num2, num3, larger;

		System.out.println("Please enter your first number");
		num1 = scan.nextDouble();

		System.out.println("Please enter your second number");
		num2 = scan.nextDouble();

		System.out.println("Please enter your third number");
		num3 = scan.nextDouble();
		
		if (num1>num2 && num1>num3) {
			larger=num1;
		
		}else {
			if(num2>num1 && num2>num3) {
				larger=num2;
			}else {
				larger=num3;
			}
		}
		
		System.out.println("the larger number is "+larger);
		
		

	}

}
