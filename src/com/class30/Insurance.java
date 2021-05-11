package com.class30;

import java.util.ArrayList;
import java.util.Iterator;


public abstract class Insurance{
    String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    abstract void getQuote();
    abstract void cancelInsurance();

}
class Car extends Insurance{
    String carModel;

    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    void getQuote() {
        System.out.println("I need a quote on my "+carModel);
    }

    @Override
    void cancelInsurance() {
        System.out.println("I would like to cancel my car insurance on my "+carModel);
    }

}

class Pet extends Insurance{
    String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    void getQuote() {
        System.out.println("I would like a quote on my "+petType);
    }

    @Override
    void cancelInsurance() {
        System.out.println("I would like to cancel my insurance I have on my "+petType);
    }

}

class Health extends Insurance{

    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println("I would like to obtain a quote on health insurance");
    }

    @Override
    void cancelInsurance() {
        System.out.println("I would like to cancel my health insurance");
    }

}

class Main1{
    public static void main(String[] args) {

        ArrayList<Insurance> insurances = new ArrayList<>();
        insurances.add(new Car("Geico", "Honda"));
        insurances.add(new Pet("Banfield", "Cat"));
        insurances.add(new Health("Cigna"));

        Iterator<Insurance> iterator= insurances.iterator();
        while (iterator.hasNext()){
            Insurance i = iterator.next();
            i.getQuote();
            i.cancelInsurance();
        }
        System.out.println("------------------------------------------");
        for (int i=0; i<insurances.size();i++){
            insurances.get(i).getQuote();
            insurances.get(i).cancelInsurance();
        }
        System.out.println("------------------------------------------");
        for(Insurance insurance:insurances){
            insurance.getQuote();
            insurance.cancelInsurance();
        }

    }
}
