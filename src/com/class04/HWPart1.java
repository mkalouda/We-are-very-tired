package com.class04;

import java.util.Scanner;

public class HWPart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-----------1----------------");
		
		
		Scanner line=new Scanner(System.in);
		
		System.out.println("What is the loan amount do you need?");
		
		int loan=line.nextInt();
		
		if (loan<=200000) {
			System.out.println("I will lend the money");
		}else {
			System.out.println("I can not provide the loan");
		}
		
		System.out.println("-----------2----------------");
		
		System.out.println("Hello, what is your age?");
		
		int age=line.nextInt();
		
		if (age>=18) {
			System.out.println("We will issue you a drivers license");
		}else {
			System.out.println("You are able to get a lerners permit");
		}
		
		
	}

}
