package com.class08;

import java.util.Scanner;

public class WhileLoopReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* we need to make user to pay for a soda
		 * keep asking user to pay you until it enters 3
		 * 
		 * if user gives more>3 --> please give less money
		 * if user gives less<3 --> please give more money
		 */
		
		Scanner scan=new Scanner(System.in);
		int money;
		int rightAmount=3;
		
		System.out.println("please pay for the sode");
		
		do {
			
			money=scan.nextInt();
			
			if (money<3) {
				System.out.println("please give more money" );
			}else if (money>3) {
				System.out.println("Please give less money");
			}
		
		}while (money != rightAmount);
		System.out.println("Thank you for the purcahse");
		
	}
		
		

	

}
