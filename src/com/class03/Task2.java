package com.class03;

public class Task2 {
	
	public static void main (String[] args) {
		
		double a=10.99;
		
		double b=12.55;
		
		if (a>b) {
			System.out.println("Double value "+ a+ "is larger than "+ b);
			
		}
		
		int c=55;
		
		if(c<32) {
			System.out.println("Water will freeze with temperature "+c);
		}else {
			System.out.println("Water will NOT freeze with temperature "+c);
			System.out.println("I am else block");
		}
		System.out.println("---------------------------------------------------------");
		double money= 10;
		double $coke= 3;
		
		if(money==$coke) {
			System.out.println("I am buying soda");
		}else {
			System.out.println("I need exact amount");
		}
		
		System.out.println("----------------------------------------------------------");
		
		boolean snow=false;
		
		if(snow) {
			System.out.println("yay, I will play in the snow");
		}else {
			System.out.println("I am going to ride my bike");
		}
		
		System.out.println("----------------------------------------------------------");
		
		boolean summer=true;
		
		if (summer) {
			System.out.println("I am going to Florida");
		}else
			System.out.println("I will stay at home");
		
	}

}
