package com.practice;

public class AsterikPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1; i<=6; i++) {
			for (int j=1;j<=6; j++) {
				if (i==1 || j==1 || i==6 || j==6) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}System.out.println();
		
		for (int i=1; i<=6; i++) {
			for (int j=1;j<=6; j++) {
				if (i==1 || j==1 || i==6 || j==6) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}

}
