package com.class17;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int salary = 1001000;
		StringBuilder sb = new StringBuilder(String.valueOf(salary));
		sb.reverse();
		
		salary=Integer.parseInt(sb.toString());
		System.out.println(salary);
		
		


	}

}
