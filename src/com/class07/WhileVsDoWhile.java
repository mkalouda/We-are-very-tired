package com.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* While= first check then execute
		 * DO = first execute then check
		 * 
		 * Even when condition is false DO will execute your code at least once
		 * 
		 * While loop is used more in programming compared to DO WHILE
		 */
		
		
		
		int num=1;
		
		while(num<=5) {
			System.out.println(num);
			num++;
		}
		
		System.out.println("----------------DO WHILE-------------------");
		
		int num1=6;
		
		do {
			System.out.println(num1);
			num1++;
		}while(num1<=5);

	}

}
