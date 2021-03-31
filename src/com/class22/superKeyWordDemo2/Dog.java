package com.class22.superKeyWordDemo2;

public class Dog extends Animal{
    String breed;

    Dog(String jack, int i, String red){
        System.out.println("Child");
    }

    public Dog(String name, int age, String color, String breed) {
        super(name, age, color);
        this.breed=breed;
        System.out.println("Parametrized child");
    }

    void printInfo(){
        System.out.println(name + " age "+ age + " breed " + breed);
    }
}
