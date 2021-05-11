package com.class28.encapsulation;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("Munz","luda","123",100000);
        bankAccount.login("luda","123");
        System.out.println(bankAccount.getBalance("sfas","f"));
    }
}
