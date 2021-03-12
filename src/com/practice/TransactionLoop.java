package com.practice;

import java.util.Scanner;

public class TransactionLoop {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		String item;
		int price;
		int money;
		int sum = 0;
		int remainder;
		
		System.out.println("What item would you like to buy?");
		item=input.nextLine();
		
		System.out.println("What is the price of the "+ item);
		price=input.nextInt();
		
		System.out.println("The "+ item + " costs "+ price+ " please enter the money.");
		
		do {
			money=input.nextInt();
			sum+=money;
			
			if (sum<price) {
				remainder=price-sum;
				System.out.println(remainder+" is left to pay");
			}else if (sum>price) {
				remainder=sum-price;
				System.out.println("Here is your change of "+ remainder);
				break;
			}else {
				System.out.println("Exact amount given");
			}
			
		}while (price!=sum);
		System.out.println("Thank you for the purchase");
		
	}
}
