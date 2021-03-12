package com.class06;

import java.util.Scanner;

public class HW3Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		char operation;
		double num1, num2, output = 0;

		System.out.println("Please enter first number");
		num1 = input.nextDouble();

		System.out.println("Please enter opertation");
		operation = input.next().charAt(0);

		System.out.println("Please enter second number");
		num2 = input.nextDouble();

		switch (operation) {

		case '+':
			output = num1 + num2;
			break;
		case '-':
			output = num1 - num2;
			break;
		case '*':
			output = num1 * num2;
			break;
		case '/':
			output = num1 / num2;
			break;
		default:
			output = 0;
			System.out.println("You entered invalid operator");
		}

		if (output != 0) {
			System.out.println(num1 + " " + operation + " " + num2 + " = " + output);
		}

	}

}
