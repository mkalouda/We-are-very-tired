package com.class21;

public class Demo3Child extends Demo3Parent{
    String name;

    Demo3Child(String name){
        super(name);
    }
    void printInfo(){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
