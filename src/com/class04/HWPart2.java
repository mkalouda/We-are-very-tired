package com.class04;

import java.util.Scanner;

public class HWPart2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("do you have a credit card");
		String card=scan.next();
		
		if (card.equals("yes")) {
			System.out.println("what is the balance on the card");
			int balance=scan.nextInt();
			
			if (balance>1000) {
				System.out.println("you need to pay it off");
			}else {
				System.out.println("you can spend more money");
			}
		
		}else {
			System.out.println("would you like to open one?");
		}
		
		System.out.println("-------------------------------------------------");
		
		System.out.println("How many years have you worked?");
		int work=scan.nextInt();
		
		if (work>=5) {
			System.out.println("you are eligible for the bonus");
			System.out.println("what is your annual salary");
			int salary=scan.nextInt();
			
			if (salary>50000) {
				System.out.println("your bonus is 5000");
			}else {
				System.out.println("your bonus is 3000");
			}
		
		}else {
			System.out.println("you can not recieve the bonus yet");
		}
	}

}		
