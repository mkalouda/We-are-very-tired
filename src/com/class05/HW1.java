package com.class05;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		String birthMonth;
		String season;
		
		System.out.println("Which month were you born in?");
		birthMonth=scan.next();
		
		if (birthMonth.equals("June") || birthMonth.equals("July") || birthMonth.equals("August")) {
			season="Summer";
		}else if (birthMonth.equals("September") || birthMonth.equals("October") || birthMonth.equals("November")) {
			season="Fall";
		}else if (birthMonth.equals("December") || birthMonth.equals("January") || birthMonth.equals("February")) {
			season="Winter";
		}else if (birthMonth.equals("March") || birthMonth.equals("April") || birthMonth.equals("May")) {
			season="Spring";
		}else {
			season="Invalid";
		}
		
		System.out.println("You were born in "+ season+" season!");

	}

}
