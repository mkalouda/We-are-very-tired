package com.class23;

public class Bank {

    void chargeTransferFee(double amount){
        System.out.println("Your fee is "+ amount*0.02);
    }
}
class BankOfAmerica extends Bank{

    void chargeTransferFee(double amount){
        System.out.println("Your fee is "+ amount*0.05);
    }
}
class Chase extends Bank{

    void chargeTransferFee(double amount){
        System.out.println("Your fee is "+ amount*0.03);
    }
}
class Citi extends Bank{

}
