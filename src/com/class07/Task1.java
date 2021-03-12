package com.class07;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// print number 1 to 100
		int a=1;
		
		while(a<=100) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println();
		
		//print number 100 to 1
		int b=100;
		
		while (b>=1) {
			System.out.print(b+" ");
			b--;
		}
		System.out.println();
		
		//print even number from 20 to 100
		int c=20;
		
		while(c<=100) {
			System.out.print(c+" ");
			c+=2;
		}
		System.out.println();
		
		int d =20;
		
		while (d<=100) {
			if (d%2==0) {
				System.out.print(d+" ");
			}
			d++;
		}

	}

}
