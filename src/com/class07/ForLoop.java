package com.class07;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WHEN WE KNow in advance how many times we would like to repeat block of code--> we use for loop
		
		//ex. I want to say hello 3 times
		
		/* first step initialization
		 * then check condition
		 * execute the block of code
		 * then increment and decrement 
		 */
		
		for (int i=1; i<=3;i++) {
			System.out.println("Hello");
		}
		
		System.out.println("-----------------print numbers from 1 to 50---------------------");
		
		for(int i=1; i<=50; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("-----------------print numbers from 10 to 1---------------------");
		
		for(int i=10;i>=1;i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("-----------------what is my output---------------------");
		
		
		for (int a=0;a<=10;a+=2) {
			System.out.print(a+" ");
		}
		
		System.out.println();
		System.out.println("-----------------what is my output---------------------");
		
		for (int i=5; i<=50; i+=10) {
			System.out.print(i+" ");
		}

	}

}
