package com.class23;

public class StaticExample {

    static void printInfo(String name){
        System.out.println("name from parent "+name);
    }
}

class ChildStaticExample extends StaticExample{

    static void printInfo(String name){
        System.out.println("name from child "+name);
    }

    public static void main(String[] args) {
        ChildStaticExample.printInfo("Yulia");
    }
}