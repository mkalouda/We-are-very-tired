package com.class11;

import java.util.Scanner;

public class arrayex {

	public static void main(String[] args) {
		/*
		 * create an array on double values using scanner 
		 * calculate the sum of all elements in that array
		 */

		Scanner scan = new Scanner(System.in);
		double sum = 0;

		System.out.println("How many values will you like to store?");
		int size = scan.nextInt();

		double[] holder = new double[size];

		System.out.println("Please enter the " + size + " values.");
		for (int i = 0; i < size; i++) {
			holder[i] = scan.nextDouble();
		}

		for (int i = 0; i < size; i++) {
			sum += holder[i];
		}
		System.out.println("The sum of the values entered is:");
		System.out.println(sum);
		
		System.out.println("---------------------another way to print------------------------------------");
		
		
		for (int i = 0; i < size; i++) {
			holder[i] = scan.nextDouble();
			sum+=holder[i];
		}
		System.out.println("The sum of "+size+ " values entered is "+ sum);
		
		System.out.println("---------------------another way to print------------------------------------");
		
		for(double num:holder) {
			sum+=num;
		}

	}

}
