package com.practice;

import java.util.Scanner;

public class NumbPractice {

	public static void main(String[] args) {

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
	}
}
