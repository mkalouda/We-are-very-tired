package com.reviewclass09.demo3;

public class Parent {

    void method(){
        System.out.println("Implementation from the parent class");
    }
}

class Child extends Parent{
    @Override
    void method() {
        System.out.println("Implementation from the child class");
    }
}

class Main{
    public static void main(String[] args) {
        Child child = new Child();
        child.method();
    }
}