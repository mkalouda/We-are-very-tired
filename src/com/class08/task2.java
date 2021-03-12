package com.class08;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		String answer;
		
		do {
			System.out.println("Please apply for a credit card");
			answer=input.nextLine();
		}while (!answer.equalsIgnoreCase("yes"));
		
		System.out.println("Great lets get started!");
		
		

	}

}
