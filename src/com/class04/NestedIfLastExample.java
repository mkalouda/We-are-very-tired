package com.class04;

public class NestedIfLastExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * to donate:
		 * you must be 18 and older, otherwise you cannot
		 * your weight must be more than 110 lbs to donate, otherwise you cannot
		 * 
		 */
		
		int age=19;
		
		int weight=111;
		
		if(age>=18) {
			System.out.println("You meet the age requirement");
			
			if(weight>110) {
				System.out.println("You are eligible to donate blood");
			}else {
				System.out.println("You are not able to donate blood");
			}
		
		}else {
			System.out.println("You are not eligible to donate");
		}

	}

}
