package com.class14;

public class CalculatorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(10, 12));
		
		double result = (double)calculator.sub(15.5, 10);
		System.out.println(result);
		
		System.out.println(calculator.mult(10.5, 11));
		
		System.out.println(calculator.div(10, 2));

	}

}
