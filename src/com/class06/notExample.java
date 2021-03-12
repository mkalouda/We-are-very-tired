package com.class06;

import java.util.Scanner;

public class notExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* we need to calculate final price after discount
		 * 
		 * first we need to check if there is a sale
		 * if no sale--> not going to shop
		 * if sale-->
		 * 			we will ask the item
		 * 			we will ask price
		 * 
		 * 			if price is less than 10--> apply 5% discount
		 * 			if price b.w 10 and 100--> apply 10% discount
		 * 			if price b.w 101 and 500--> apply 20% discount
		 * 			if price more than 500--> apply 30% 
		 */
		
		
		Scanner scan;
		String sale="yes";
		String item = null;
		double price = 0;
		double discount = 0;
		
		scan=new Scanner(System.in);
		
		
		if(!sale.equals("yes")) {
			System.out.println("we are not going shopping");
		
		}else {
			
			System.out.println("What is the Item you are purchasing?");
			item=scan.next();
			
			System.out.println("What is the price of it?");
			price=scan.nextDouble();
			
			if(price<10 && price>0) {
				discount=price*.05;
			}else if (price>=10 && price<=100) {
				discount=price*.10;
			}else if (price>=101 && price<=500) {
				discount=price*.20;
			}else {
				discount=price*.30;
			}
		}
		
		System.out.println("The item you purchased "+ item+ ", original price is "+ price+ ", with discount price is "+ discount);

	}

}
