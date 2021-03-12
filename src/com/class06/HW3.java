package com.class06;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1, num2, output = 0;
		String operator;
		Scanner input;

		input = new Scanner(System.in);

		System.out.println("Please enter first number");
		num1 = input.nextDouble();

		System.out.println("Please enter operator");
		operator = input.next();

		System.out.println("Please enter second number");
		num2 = input.nextDouble();

		if (operator.equals("+")) {
			output = num1 + num2;
		} else if (operator.equals("-")) {
			output = num1 - num2;
		} else if (operator.equals("*")) {
			output = num1 * num2;
		} else if (operator.equals("/")) {
			output = num1 / num2;
		} else {
			output = 0;
			System.out.println("Invalid");
		}

		if (output != 0) {
			System.out.println("The result is " + output);
		}

	}

}
