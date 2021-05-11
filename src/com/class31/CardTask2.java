package com.class31;

public abstract class CardTask2 {
    String creditCardType;

    CardTask2(String creditCardType){
        this.creditCardType=creditCardType;
    }
    abstract void calculateInterest();
    public void issueCard(){
        System.out.println(creditCardType+" issued");
    }
}

class CreditCard extends CardTask2{

    CreditCard(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void calculateInterest() {
        System.out.println("interest is 15%");
    }
}

class DebitCard extends CardTask2{

    DebitCard(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void calculateInterest() {
        System.out.println("interest is 0% but has a fee of $20");
    }
}

class PrepaidCard extends CardTask2{

    PrepaidCard(String creditCardType) {
        super(creditCardType);
    }

    @Override
    void calculateInterest() {
        System.out.println("Must pay all the money before hand");
    }
}