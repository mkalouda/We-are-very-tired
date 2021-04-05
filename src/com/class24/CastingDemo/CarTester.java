package com.class24.CastingDemo;

public class CarTester {
    public static void main(String[] args) {

        Car bmw = new BMW();
        bmw.start(); //method from child will be called cuz we have overridden it
        bmw.stop(); //method from parent will be called cuz we have not overridden it
        //bmw.drifting(); CE not allowed by using parent reference

        BMW bmw1 = (BMW) bmw; //because now we have converted our reference back to BMW
        bmw1.drifting();
        bmw1.park();

        /*Car car = new Tesla();
        BMW bmw2 =(BMW) car;*/ // will give an error cuz now trying to store BMW into tesla
    }
}
