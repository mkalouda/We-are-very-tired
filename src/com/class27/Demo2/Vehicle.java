package com.class27.Demo2;

public abstract class Vehicle {
    String vin_number;
    static int totalVehicle;

    Vehicle(String vin_number){
        totalVehicle++;
        this.vin_number=vin_number;
        System.out.println("Grandparents constructor called");
    }

    public void totalVehiclesCreated(){
        System.out.println("We build "+totalVehicle+" Vehicle");
    }

    public void drive(){
        System.out.println("Vehicle can drive");
    }
    public void stop(){
        System.out.println("Vehicle can stop");
    }
    public abstract void start();
}

abstract class Car extends Vehicle{
    String carType;
    Car(String vin_number, String carType){
        super(vin_number);
        this.carType=carType;
        System.out.println("Parents constructor called");
    }
    @Override
    public void drive(){
        System.out.println("Car can drive");
    }

    public abstract void speed();
}

class BMW extends Car{

    String make;
    String model;

    BMW(String vin_number, String carType, String make, String model) {
        super(vin_number, carType);
        this.make=make;
        this.model=model;
        System.out.println("Grandchild constructor called");
    }

    @Override
    public void start() {
        System.out.println("BMW can start with remote");
    }

    @Override
    public void speed() {
        System.out.println("BMW can go max speed 300mph");
    }

    public void display(){
        System.out.println("We build "+make+" Model "+model+" "+carType+" "+vin_number);
    }
}

class Toyota extends Car{

    String make;
    String model;

    Toyota(String vin_number, String carType, String make, String model) {
        super(vin_number, carType);
        this.make=make;
        this.model=model;
    }

    @Override
    public void start() {
        System.out.println("Toyota can also start with remote");
    }

    @Override
    public void speed() {
        System.out.println("Toyota can go upto 200mpg");
    }

    void display(){
        System.out.println("We build "+make+" Model "+model+" "+carType+" "+vin_number);
    }
}