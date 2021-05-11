package com.class30;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("fanta");
        drinks.add("juice");
        drinks.add("beer");
        drinks.add("sprite");
        drinks.add("cola");
        drinks.add("soda");

        for(String drink:drinks){
            if(drink.contains("a") || drink.contains("e")){
                drinks.set(drinks.indexOf(drink), "water");
            }
        }
        System.out.println(drinks);

        for (int i=0; i<drinks.size(); i++){
            if(drinks.contains("a") || drinks.contains("e")){
                drinks.set(i,"water");
            }
        }
        System.out.println(drinks);
    }
}
