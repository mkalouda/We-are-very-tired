package com.class05;

import java.util.Scanner;

public class Task1BetterWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("enter your height in inches");
		double height = scan.nextDouble();
		
		String definition;

		if (height < 60) {
			definition="short";
		
		} else if (height >= 60 && height <= 72) {
			definition="medium";
		
		} else {
			definition="tall";
		}
		
		System.out.println("you are a person whose height is "+definition);

	}

}
