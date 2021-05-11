package com.class30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class Card {
    String cardType;

    public Card(String cardType) {
        this.cardType = cardType;
    }

    void insert(){
        System.out.println("Please insert the card");
    }
    abstract void home();
}

class Chase extends Card{

    public Chase(String cardType) {
        super(cardType);
    }

    @Override
    void home() {
        System.out.println("Welcome to " + cardType + " Banking");
    }
}

class WellsFargo extends Card{

    public WellsFargo(String cardType) {
        super(cardType);
    }

    @Override
    void home() {
        System.out.println("Welcome to " + cardType + " Banking");
    }
}

class Citi extends Card{

    public Citi(String cardType) {
        super(cardType);
    }

    @Override
    void home() {
        System.out.println("Welcome to " + cardType + "Banking");
    }
}

class CardTester{
    public static void main(String[] args) {
        LinkedList<Card> cards = new LinkedList<>();
        cards.add(new Chase("Chase"));
        cards.add(new WellsFargo("Wells Fargo"));
        cards.add(new Citi("Citi"));

        Iterator<Card> cardIterator = cards.iterator();
        while (cardIterator.hasNext()){
            Card card = cardIterator.next();
            card.insert();
            card.home();
        }
        System.out.println("------------------------------------------");
        for(Card card:cards){
            card.insert();
            card.home();
        }
        System.out.println("------------------------------------------");
        for (int i=0; i< cards.size();i++){
            cards.get(i).insert();
            cards.get(i).home();
        }
    }
}
