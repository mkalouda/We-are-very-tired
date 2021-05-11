package com.class29;

public class WrapperClassesDemo2 {
    public static void main(String[] args) {
        int a=10;
        Integer aa=a;
        a=aa;

        Integer integer = new Integer(10); //longer called boxing
        Integer integer1=45; //direct assignment, manual, called auto boxing

        int abc = integer.intValue(); //longer called unboxing
        abc=integer; // auto unboxing
    }
}
