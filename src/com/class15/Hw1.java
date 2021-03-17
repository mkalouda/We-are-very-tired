package com.class15;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String momName;
		String dadName;
		String gender;
		
		System.out.println("What is the mom's first name");
		momName = scan.next();
		
		System.out.println("What is the dad's first name");
		dadName = scan.next();
		
		System.out.println("Expecting boy or girl");
		gender = scan.next();
		
		if(gender.equalsIgnoreCase("boy")) {
			System.out.println(dadName.substring(0,3) + momName.substring(2));
		}else {
			System.out.println(momName.substring(0,2) + dadName.substring(3));
		}

	}

}
