package com.class23;

public class BankTester {

    public static void main(String[] args) {
        BankOfAmerica bankOfAmerica = new BankOfAmerica();
        bankOfAmerica.chargeTransferFee(1000);

        Chase chase = new Chase();
        chase.chargeTransferFee(1000);

        Citi citi = new Citi();
        citi.chargeTransferFee(1000);
    }
}
