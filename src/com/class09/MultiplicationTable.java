package com.class09;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mult;
		
		for (int i=1;i<=9;i++) {
			for (int j=1; j<=9; j++) {
				mult=i*j;
				System.out.println(i+""+"*"+j+"="+mult);
			}
			System.out.println();
		}

	}

}
