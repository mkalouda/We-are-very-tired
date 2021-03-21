package com.class18;

public class Task {
	
	/*
	 * Create a method that will accept an array as parameters and will return a sum of all elements from that array. 
	 * Method should be visibly only within same package and accessible by the creating an instance of the class
	 */
	
	
		double sumArrayElements( double[] arr) {
			double sum = 0;
			for (double element:arr) {
				sum+=element;
			}
			return sum;
		}

}
