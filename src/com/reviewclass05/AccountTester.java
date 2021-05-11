package com.reviewclass05;

import java.util.Scanner;

public class AccountTester {
    public static void main(String[] args) {

        Account munzAccount = new Account();
        munzAccount.signUp();
        boolean isSuccessful=munzAccount.signIn();
        if(isSuccessful){
            System.out.println("Enter the amount you want to transfer");
            Scanner scan = new Scanner(System.in);
            munzAccount.withDraw(scan.nextDouble());
        }
    }

}
