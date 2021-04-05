package com.class25.Overriding;

public class Father {
    String name;

    public Father (String name) {
        this.name = name;
    }

    void eat(){
        System.out.println(name+" like to eat rice");
    }
    void sleep(){
        System.out.println(name+" like to sleep 6 hours");
    }
}
