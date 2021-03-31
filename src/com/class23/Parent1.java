package com.class23;

public class Parent1 {

    public void printSomething(){
        System.out.println("Parent");
    }
}

class Child extends Parent1{

    public void printSomething(){
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.printSomething();
    }
}