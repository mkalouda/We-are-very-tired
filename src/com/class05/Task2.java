package com.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner (System.in);
		
		System.out.println("enter a day of the week");
		int day=input.nextInt();
		
		if (day>=1 && day<=5) {
			System.out.println("it is a weekday");
		}else if (day>=6 && day<=7) {
			System.out.println("it is a weekend");
		}else {
			System.out.println("Invalid day");
		}

	}

}
