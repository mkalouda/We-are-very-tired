package com.class06;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan;
		char grade;
		String expl;
		
		scan=new Scanner(System.in);
		
		System.out.println("Please enter your grade");
		grade=scan.next().charAt(0); 
		
		switch (grade) {
		
		case 'A':
			expl="Excellent";
			break;
		case 'B':
			expl="Good";
			break;
		case 'C':
			expl="Average";
			break;
		case 'D':
			expl="Bad";
			break;
		default:
			expl="Not Acceptable";
			break;
		
		}
		
		System.out.println("Your grade of: "+ grade +", is "+ expl);

	}

}
