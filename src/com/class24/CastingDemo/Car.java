package com.class24.CastingDemo;

public class Car {
    String make;
    String model;
    void start(){
        System.out.println("Use the key to start me");
    }
    void stop(){
        System.out.println("Use the brakes to stop me");
    }
    void park(){
        System.out.println("Park me manually");
    }
}

class BMW extends Car{

    void start(){
        System.out.println("Use the button to start me");
    }

    void drifting(){
        System.out.println("I can drive very fast");
    }
}

class Tesla extends Car{

    void start(){
        System.out.println("Use the app to start me");
    }

    void park(){
        System.out.println("I could park automatically");
    }
}

class Toyota extends Car{

}
