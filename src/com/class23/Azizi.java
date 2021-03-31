package com.class23;

public class Azizi {

    void marry(){
        System.out.println("My boy will marry the girl that me and my wife will"+" choose for him");
    }
}

class Son1 extends Azizi{

}

class Son2 extends Azizi{

    void marry(){
        System.out.println("I want to marry someone else");
    }

    public static void main(String[] args) {
        Son2 son2 = new Son2();
        son2.marry();

        Son1 son1 = new Son1();
        son1.marry();
    }
}
