package com.class26;

public class Parent {
    final void method1(){
        System.out.println("No child is allowed to change me");
    }
}

class Child extends Parent{

}
