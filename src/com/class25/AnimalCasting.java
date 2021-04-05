package com.class25;

public class AnimalCasting {

    void eat(){
        System.out.println("Animals can eat");
    }
    void sleep(){
        System.out.println("Animals can sleep");
    }
}

class Dog extends AnimalCasting{
    @Override
    void eat() {
        System.out.println("Dogs like to eat meat");
    }
    void bark(){
        System.out.println("Dog is barking");
    }
}

class Cat extends AnimalCasting{

    void speak(){
        System.out.println("meow meow");
    }
}
