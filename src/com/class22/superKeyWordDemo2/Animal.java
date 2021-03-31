package com.class22.superKeyWordDemo2;

public class Animal {
    String name;
    int age;
    String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        System.out.println("parametrized parent");

    }
    public Animal(){
        System.out.println("Parent");
    }
}
