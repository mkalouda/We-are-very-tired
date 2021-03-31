package com.class21;

public class Demo2Parent {
    int num1;
    int num2;
    String name;

    public Demo2Parent(int num1, int num2, String name) {
        this.num1 = num1;
        this.num2 = num2;
        this.name = name;
    }

    int add(){
        return num1+num2;
    }
}
