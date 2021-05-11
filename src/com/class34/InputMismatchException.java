package com.class34;

import java.util.Scanner;

public class InputMismatchException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        try {
            System.out.println("Please enter your favorite number");
            num= scan.nextInt();
            System.out.println("Favorite number entered is "+num);
        }catch (java.util.InputMismatchException inputMismatchException){
            System.out.println("you entered the wrong value type");
        }

    }
}
