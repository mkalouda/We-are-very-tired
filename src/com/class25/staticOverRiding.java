package com.class25;

public class staticOverRiding {

    static void printInfo(){
        System.out.println("bla bla");
    }
}

class Child extends staticOverRiding{

    static  void printInfo(){
        System.out.println("bla bla");
    }

}
