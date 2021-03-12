package com.class08;

import java.util.Scanner;

public class whileSoda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		int money;
		
		System.out.println("Please pay for the soda"); 
		money=input.nextInt();
		
		while (money !=3) {
			
			if (money<3) {
				System.out.println("please give more money");
			}else if (money>3) {
				System.out.println("please give less money");
			}
			
			money=input.nextInt();
		}
		
		System.out.println("Thank you");

	}

}
