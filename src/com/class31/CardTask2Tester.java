package com.class31;

import java.util.LinkedList;

public class CardTask2Tester {
    public static void main(String[] args) {
        LinkedList<CardTask2> linkedList = new LinkedList<>();
        linkedList.add(new CreditCard("Credit Card"));
        linkedList.add(new DebitCard("Debit Card"));
        linkedList.add(new PrepaidCard("Prepaid Card"));

        for (CardTask2 cardTask2 : linkedList) {
            cardTask2.issueCard();
            cardTask2.calculateInterest();
        }
    }
}
