package com.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int quiz, midTerm, finalScore, average;
		char grade;
		
		System.out.println("Please input quiz grade");
		quiz=scan.nextInt();
		
		System.out.println("Please innput mid term grade");
		midTerm=scan.nextInt();
		
		System.out.println("Please input finalt exam grade");
		finalScore=scan.nextInt();
		
		average=(quiz+midTerm+finalScore)/3;
		System.out.println("Average score is "+average);
		
		if (average>=90) {
			grade='A';
		}else if (average>=70 && average<90) {
			grade='B';
		}else if (average >=50 && average<70) {
			grade='C';
		}else {
			grade='F';
		}
		
		System.out.println("your final grade is "+ grade);

	}

}
