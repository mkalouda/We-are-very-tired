package com.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("enter your height in inches");
		double height=scan.nextDouble();
		
		if (height<60) {
			System.out.println("you are short");
		}else if (height>=60 && height<=72) {
			System.out.println("you are medium");
		}else {
			System.out.println("you are tall");
		}

	}

}
