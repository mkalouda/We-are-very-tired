package com.class23;

public class OverridingExample {
    public static void main(String[] args) {
        System.out.println("main from parent");
    }
}

class ChildOverriding extends OverridingExample{

    public static void main(String[] args) {
        System.out.println("main from child");
    }
}

class Child2{
    public static void main(String[] args) {
        String [] args1={"hi"};
        ChildOverriding.main(args1);
    }
}