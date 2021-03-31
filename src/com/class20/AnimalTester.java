package com.class20;

public class AnimalTester {
    public static void main(String[] args) {

        Dog dog1 = new Dog("jacky");
        dog1.bark();
        dog1.sleep();
        dog1.eat();

        Cat cat1 = new Cat("Tom");
        cat1.meow();
        cat1.sleep();
        cat1.eat();

    }
}
