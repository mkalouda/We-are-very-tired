package com.reviewclass05;

public class MethodTester {
    public static void main(String[] args) {
        MethodsDemo methodsDemo = new MethodsDemo();

        methodsDemo.simpleMethod();

        System.out.println(methodsDemo.simpleIntMethod());
        //or
        int number = methodsDemo.simpleIntMethod();
        System.out.println(number);

        methodsDemo.onlyTakesInput(100);

        methodsDemo.methodWithTwoInputs("munz", 200000);

        System.out.println(methodsDemo.sum(20, 5));

        System.out.println(methodsDemo.isNumberPositive(-5));
    }
}
