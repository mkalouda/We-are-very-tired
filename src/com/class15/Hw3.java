package com.class15;

public class Hw3 {

	public static void main(String[] args) {
		
		int sum=0;
		String reverse = "";
		String correct = "Sunday";
		
		for (int i=correct.length()-1; i>=0; i--) {
			reverse+=correct.charAt(i);
		}
		System.out.println(reverse);

	}

}
