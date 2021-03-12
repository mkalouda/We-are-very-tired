package com.class08;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String item;
		int price;
		int money;
		int sum=0;
		int remainder;
		
		System.out.println("Please enter the item you would like to buy");
		item=input.nextLine();
		
		System.out.println("Please enter the price of "+ item);
		price=input.nextInt();
		
		System.out.println("Please pay for "+ item);
		
		do {
			
			money=input.nextInt();
			sum+=money;
			
			if(sum<price) {
				remainder=price-sum;
				System.out.println("Please give "+remainder);
			}else if (sum>price) {
				remainder=sum-price;
				System.out.println("Here is your change "+ remainder);
				break;
			}else {
				System.out.println("Right amount entered");
			}
		
		}while(price!=sum);
		System.out.println("Thank you for shopping");

	}

}
