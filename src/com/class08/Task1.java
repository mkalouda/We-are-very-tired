package com.class08;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		for (int i = 1; i <= 50; i++) {

			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("---------------------------------");

		String apply;

		System.out.println("Would you like to apply for a credit card?");
		apply = input.next();

		while (!apply.equals("yes")) {

			System.out.println("Would you like to apply for a credit card?");
			apply = input.next();

			if (apply.equals("yes")) {
				System.out.println("Great! lets get started!");
				break;

			}
		}
		System.out.println("---------------------------------");

		int even = 0;
		int odd = 0;

		System.out.println("Please enter a start and end point range of numbers");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		if (num1 < num2) {

			for (int i = num1; i <= num2; i++) {

				if (i % 2 == 0) {
					even += i;
				} else {
					odd += i;
				}
				
			}

			System.out.println("sum of odd numbers from " + num1 + " up to " + num2 + " equals to " + odd);
			System.out.println("sum of odd numbers from " + num1 + " up to " + num2 + " equals to " + even);

		}

		System.out.println("---------------------------------");

		int remainder, extra, moneyGiven, restGiven;

		System.out.println("What item would you like to buy?");
		String item = input.next();

		System.out.println("What is the price of the item?");
		int itemPrice = input.nextInt();

		System.out.println("Please insert the money");

		do {
			moneyGiven = input.nextInt();

			if (moneyGiven < itemPrice) {
				remainder = itemPrice - moneyGiven;
				System.out.println(remainder + " is left to pay");
				restGiven = input.nextInt();
				break;

			} else if (moneyGiven > itemPrice) {
				extra = moneyGiven - itemPrice;
				System.out.println(extra + " is your change");
				break;
			}

		} while (moneyGiven != itemPrice);
		System.out.println("Thank you for shopping");

	}

}
