package com.class14;

public class MoreMethodExamples {
	
	/*
	 * Create a method that does not take any values
	 * and always return "Hi"
	 */
	
	String print() {
		return "Hi";
	}
	
	/*
	 * create a method that takes a number 
	 * and returns the double of that number
	 */
	
	double doubleTheValue(double num) {
		return num*2;
	}
	
	/*
	 * Create a method that will take a boolean as input
	 * if the value is true then i want to say
	 * "take the umbrella and if false "please go for a walk"
	 */
	
	void isRaining(boolean isRain) {
		if(isRain) {
			System.out.println("Please take the umbrella");
		}else {
			System.out.println("Please go for a walk");
		}
	}

}
