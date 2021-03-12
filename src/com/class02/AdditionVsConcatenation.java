package com.class02;

public class AdditionVsConcatenation {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=11;
		
		String str1="Hello";
		String str2="Hi";
		
		System.out.println(num1+num2+str1+str2);
		System.out.println(num1+str1+num2+str2);
		System.out.println(str1+str2+num1+num2);
		
		//when number is added to a number at first it adds it
		//when it after a string it combines it to the string 
		
		String result=str1+str2+num1+num2;
		System.out.println(result);
		
		String result1=str1+str2+(num1+num2);
		System.out.println(result1);
		
		System.out.println(str1+str2+(num1+num2));
		
	}

}
