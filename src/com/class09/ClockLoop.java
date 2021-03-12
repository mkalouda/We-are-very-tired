package com.class09;

public class ClockLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int a = 0; a <= 2; a++) {
			for (int b = 0; b <= 3; b++) {
				for (int c = 0; c <= 5; c++) {
					for (int d = 0; d <= 9; d++) {
						System.out.println(a + "" + b + ":" + c + "" + d);
					}
				}
			}
		}
		System.out.println("-----------------------------------------");

		for (int a = 0; a <= 23; a++) {

			for (int b = 0; b <= 59; b++) {

				if (b < 10 && a < 10) {
					System.out.println("0" + a + ":0" + b);
				} else if (a < +10 && b >= 10) {
					System.out.println("0" + a + ":" + b);
				} else if (a >= 10 && b < 10) {
					System.out.println(a + ":0" + b);
				} else {
					System.out.println(a + ":" + b);
				}
			}
		}

	}

}
