package com.reviewclass10;

public abstract class Calculator {
    public static double add(double number1, double number2) {
        return number1+number2;
    }
}

class CalculatorTester{
    public static void main(String[] args) {
        System.out.println(Calculator.add(12,12));
    }
}
