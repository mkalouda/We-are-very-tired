package com.class34;

public class Account {
    double balance;
    Account(double balance){
        this.balance=balance;
    }
    public void transfer(double amountToTransfer) {
        if (balance < amountToTransfer) {
           // System.out.println("Insufficient funds");
            throw new InsufficientFundsException("Not enough balance"); //must be last line
        }
    }
}
