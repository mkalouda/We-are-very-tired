package com.reviewclass05;

import java.util.Scanner;

public class Account {

        String userName;
        String password;
        double balance;

        void signUp(){
            System.out.println("Welcome to Bank Of America");
            System.out.println("Choose your UserName");
            Scanner scan = new Scanner(System.in);
            userName = scan.next();
            System.out.println("Please choose your password");
            password = scan.next();
            System.out.println("Enter the money would you like to deposit");
            balance = scan.nextDouble();
        }

        boolean signIn(){
            System.out.println("Please enter your username");
            Scanner scan = new Scanner(System.in);
            String enteredUsername = scan.next();
            System.out.println("Please enter your password");
            String enteredPassword = scan.next();
            if(enteredUsername.equals(userName) && enteredPassword.equals(password)){
                System.out.println("Welcome to Bank of America");
                return true;
            }else{
                System.out.println("Either username or password is false");
                return false;
            }
        }

        void withDraw(double amountToTransfer){
            if(amountToTransfer>balance){
                System.out.println("Balance is not enough");
            }else{
                balance-=amountToTransfer;
                System.out.println("Transfer is successful");
            }
        }
}
