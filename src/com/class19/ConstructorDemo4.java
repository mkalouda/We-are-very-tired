package com.class19;

public class ConstructorDemo4 {

    String name;

    ConstructorDemo4(){
        System.out.println("Empty parameter constructor");
    }

    ConstructorDemo4(String name){
        System.out.println("Parameterized constructor");
    }

    public static void main(String[] args) {

        new ConstructorDemo4();
        new ConstructorDemo4("Munz");
    }
}
