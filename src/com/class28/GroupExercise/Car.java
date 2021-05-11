package com.class28.GroupExercise;

public abstract class Car {
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    abstract double calculateSalePrice();
}

class Truck extends Car{
    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight=weight;
    }

    @Override
    double calculateSalePrice() {
       if(weight>2000){
           return carPrice-(carPrice*.1);
       }else {
           return carPrice-(carPrice*.2);
       }
    }

    void display(){
        System.out.println("This "+color+" car, original price is "+carPrice+" and after discount the total is now "
                + calculateSalePrice());
    }
}
class Sedan extends Car{
    double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length=length;
    }

    @Override
    double calculateSalePrice() {
        if(length>20){
            return carPrice-(carPrice*.05);
        }else{
            return carPrice-(carPrice*.1);
        }
    }

    void display(){
        System.out.println("This "+color+" car, original price is "+carPrice+" and after discount the total is now "
        + calculateSalePrice());
    }
}
