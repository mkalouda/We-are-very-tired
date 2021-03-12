package com.class04;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean diploma=true;
		double gpa=3.1;
		
		if (diploma) {
			System.out.println("Congratulations");
			
			if (gpa>=3.5) {
				System.out.println("you are eligible for scholarship");
			}else {
				System.out.println("You should have studied harder");
			}
		
		}else {
			System.out.println("get a degree");
		}
		
		System.out.println("-----------------------------------------------------------------");
		
		double mortgageRate=4.3;
		
		int house=2000000;
		
		if (mortgageRate>4.5) {
			System.out.println("You can not buy a house");
		
		}else {
			System.out.println("You can buy a house");
			
			if (house>200000) {
				System.out.println("I will take a loan");
			}else {
				System.out.println("I wil pay cash");
			}
		}

	}

}
