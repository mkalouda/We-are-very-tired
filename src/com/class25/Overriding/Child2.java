package com.class25.Overriding;

public class Child2 extends Father{

    public Child2(String name) {
        super(name);
    }

    @Override
    void sleep() {
        System.out.println(name+" likes to sleep"+10);
    }

    @Override
    void eat() {
        super.eat();
        System.out.println(name+" likes to eat burgers");
    }
}
