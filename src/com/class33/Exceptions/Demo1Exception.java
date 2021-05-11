package com.class33.Exceptions;

import java.util.Scanner;

public class Demo1Exception {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner scanner = new Scanner(System.in);
        int num1= scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();
        if (num2==0){
            System.out.println("can not divide");
        }else{
            System.out.println(num1/num2);
        }

        System.out.println("important line of code");
        System.out.println("important line of code");
        System.out.println("important line of code");
    }
}
