package com.class28.Abstraction;

public abstract class Parent {
    abstract void method1();
}
class Child extends Parent{
    @Override
    void method1() {
        System.out.println("anstract method");
    }
}
