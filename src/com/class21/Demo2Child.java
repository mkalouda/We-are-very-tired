package com.class21;

public class Demo2Child extends Demo2Parent{
    int num1;
    int num2;

    public Demo2Child(int num1, int num2, String name) {
        super(num1, num2, name);
    }

    int average(){
        return super.add()/2;
    }

    int add(){
        return super.num1+this.num2-10;
    }
}
