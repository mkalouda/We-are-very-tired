package com.class05;

import java.util.Scanner;

public class HWRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String creditCard;
		double balance;
		Scanner scan;
		
		scan=new Scanner(System.in);
		
		System.out.println("Do you have a credit card?");
		creditCard=scan.next();
		
		if (creditCard.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance on the credit card?");
			balance=scan.nextDouble();
			
			if(balance>1000) {
				System.out.println("Pay it off immediately");
			}else {
				System.out.println("Spend more");
			}
			
		}else {
			System.out.println("Would you like to open a credit card?");
		}

	}

}
