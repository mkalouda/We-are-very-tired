package com.class07;

import java.util.Scanner;

public class LotteryWithWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input;
		int num;
		int lotteryNumber = 17;

		input = new Scanner(System.in);

		System.out.println("Please enter any number from 1 to 100 to win the lottery");
		num = input.nextInt();

		while (num != lotteryNumber) {
			System.out.println("Please enter any number from 1 to 100 to win the lottery");
			num = input.nextInt();
		}

		System.out.println("Congrats you are the winner!! With lucky number " + num);
	}

}
