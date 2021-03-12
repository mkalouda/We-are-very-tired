package com.class06;

import java.util.Scanner;

public class notExampleredo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double price,discPrice,finalPrice;
		String item;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("do we have a sale today");
		
		boolean sale=scan.nextBoolean();
		
		if (!sale) {
			System.out.println("I am not going shopping");
		}else {
			System.out.println("what is your item?");
			item=scan.next();
			System.out.println("what is the price of the item?");
			price=scan.nextDouble();
			
			if(price>0 && price<10) {
				discPrice=price*.05;
				
			}else if (price>=10 && price<=100) {
				discPrice=price*.10;
				
			}else if (price>=101 && price<=500) {
				discPrice=price*.20;
				
			}else {
				discPrice=price*.30;
				
			}
			
			finalPrice=price-discPrice;
			
			System.out.println("you are buying a "+ item + ", with orginal price = "+ price + " after discount of "+ discPrice+ " your final price is = "+ finalPrice);
			
			if (finalPrice<500) {
				System.out.println("I did not go crazy while shopping");
			}
		}

	}

}
