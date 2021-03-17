package com.class15;

public class ConcatDemo {

	public static void main(String[] args) {
		
		String firstName = "Steven ";
		String lastName = "Joe";
		System.out.println(firstName + lastName); //widely used
		
		String fullName = firstName + lastName;
		System.out.println(fullName);
		
		fullName= firstName.concat(lastName); //Not common.....can only combine two strings
		System.out.println(fullName);
		
		String var1 = "Hello ";
		int var2=14;
		System.out.println(var1 + var2);
		//System.out.println(var1.concat(var2));   wont work combining it to a number

	}

}
