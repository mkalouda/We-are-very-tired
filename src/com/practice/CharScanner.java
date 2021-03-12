package com.practice;

import java.util.Scanner;

public class CharScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		char grade;
		String result;
		
		System.out.println("please enter your grade");
		grade=scan.next().charAt(0);
		
		switch (grade) {
		
		case 'A':
			result="Excellent";
			break;
		case 'B':
			result="Good";
			break;
		case 'C':
			result="Okay";
			break;
		case 'D':
			result="teribble";
			break;
		case 'F':
			result="Unaceptable";
			break;
		default:
			result="Invalid";
			break;
		}
		
		System.out.println("Based on the grade entered, this is "+result+" work!");

	}

}
