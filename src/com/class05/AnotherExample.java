package com.class05;

import java.util.Scanner;

public class AnotherExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* we have to calculate commission based on sales
		 * 
		 * ask user to enter sale that he made
		 * based on sale we will calculate commission
		 * if sale is b.w 10 to 100--> commission is 10%
		 * if sale is b.w 101 to 500--> commission is 20%
		 * if sale is b.w 501 to 1000--> commission is 30%
		 * if more than 1000---> commission is 50%
		 */
		
		Scanner scan;
		double saleAmount, commission;
		
		scan=new Scanner (System.in);
		
		System.out.println("Please enter you daily sale amount");
		saleAmount=scan.nextDouble();
		
		if (saleAmount<10) {
			commission=0;
		}else if (saleAmount>=10 && saleAmount<=100) {
			commission=saleAmount*0.10;
		}else if (saleAmount>100 && saleAmount<=500) {
			commission=saleAmount*0.20;
		}else if (saleAmount>500 && saleAmount<=1000) {
			commission=saleAmount*0.30;
		}else {
			commission=saleAmount*0.50;
		}
		
		System.out.println("The commission based of your sale is "+ commission);
		
		// if commission is more than 500--> you are amazing seller
		
		if(commission>500) {	
		System.out.println("you are an amazing seller");
		}

	}

}
