package com.class25;

public class AnimalCastingTester {
    public static void main(String[] args) {
        AnimalCasting animalCasting = new Cat();
        animalCasting.eat();
        animalCasting.sleep();
        //animalCasting.sleep(); no place to hold
        Cat cat =(Cat) animalCasting;
        cat.speak();
    }
}
