package com.class27.Demo2;

public class VehicleTester {
    public static void main(String[] args) {
        BMW bmw = new BMW("1234xsd", "Sedan", "BMW", "X5");

        bmw.start();
        bmw.stop();
        bmw.speed();
        bmw.drive();
        bmw.display();

        Vehicle toyota = new Toyota("1452wer", "SUV", "Toyota", "RAV4");
        //toyota.display(); CE since the grandparent doesnt know the method
        toyota.drive();
        toyota.start();

        Car car = new Toyota("1452wer", "SUV", "Toyota", "RAV4");
        car.drive();
        car.speed();
    }
}
