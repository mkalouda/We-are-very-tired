package com.class05;

public class ifWithNoBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// only one statement will get executed...the rest of the statements will not be
		// read as part of if block
		String day = "monday";

		if (day.equals("Friday"))
			System.out.println("today is my movie day");
		    System.out.println("tomorrow I have a class at Syntax");

		

		
		//if no braces java identifies only 1statement per block (if block or else block)   
		    
		    
		int num = 10;

		if (num >= 10)
			System.out.println("Number is larger than 10");
		else
			System.out.println("number is less than 10");
		    System.out.println("second statement inside else block");

	}

}
