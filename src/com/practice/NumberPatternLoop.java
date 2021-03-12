package com.practice;

public class NumberPatternLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			for (int i = 1; i <= 7; i++) {
				for (int j = 1; j <= i; j++)
					System.out.print(j + " ");
				System.out.println();
			}
			System.out.println("-----------------------------------------------------");
			
			int left=7;
			
			for (int i = 1; i <= left; i++) {
				for (int j = 1; j <=(left-i+1); j++)
					System.out.print(j + " ");
				System.out.println();
			} 
			for (int i = 2; i <= 7; i++) {
				for (int j = 1; j <= i; j++)
					System.out.print(j + " ");
				System.out.println();
			}
			System.out.println("-----------------------------------------------------");
			
			for (int i=1; i<=left; i++) {
				for (int whiteSpace=1; whiteSpace<=(left-i); whiteSpace++) 
					System.out.print(" ");
				
				for (int j=1; j<=i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
			System.out.println("-----------------------------------------------------");
			
			for (int i=1; i<=left; i++) {
				for (int whiteSpace=2; whiteSpace<=i; whiteSpace++) 
					System.out.print(" ");
				
				for (int j=1; j<=(left-i+1); j++) {
					System.out.print(j);
				}
				System.out.println();
			}
			
			for (int i=8;i>=0;i--) {
				for (int j=i;j>=0;j--) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
	}

}
