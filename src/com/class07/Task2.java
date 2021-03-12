package com.class07;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("--------------print numbers from 1 to 100 in 1 linew/ space---------------");

		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("--------------print numbers from 100 to 1---------------");

		for (int i = 100; i >= 1; i--) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("--------------print even numbers from 20 to 1 (2 ways)---------------");

		for (int i = 20; i >= 1; i -= 2) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 20; i >= 1; i--) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
		System.out.println("--------------print odd numbers from 20 to 50 (2 ways)---------------");

		for (int i = 20; i <= 50; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		for (int i = 21; i <= 50; i += 2) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("--------------WHAT IS THE OUTPUT---------------");

		int sum = 0;

		for (int i = 1; i <= 5; i++) {
			sum = sum + i;
		}
		System.out.print(sum);

		System.out.println();
		System.out.println("--------------WHAT IS THE OUTPUT---------------");

		int result = 0;

		for (int i = 2; i < 10; i += 2) {
			result += i;
		}
		System.out.println(result);

	}

}
