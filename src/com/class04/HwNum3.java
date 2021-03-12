package com.class04;

import java.util.Scanner;

public class HwNum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Please input your city");

		String city = scan.nextLine();

		System.out.println("What is the temperature");

		double temp = scan.nextDouble();

		double celsius = (temp - 32) / 1.8;

		System.out.println("The temperature of " + city + " is " + celsius);

	}

}
