package com.class31;

public abstract class InsuranceTask1 {
    String insuranceName;

    InsuranceTask1(String insuranceName){
        this.insuranceName=insuranceName;
    }
    public abstract void getQuote();
    public abstract void cancelInsurance();
}

class Car extends InsuranceTask1{
    String carModel;

    Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    public void getQuote() {
        System.out.println("Gets a quote for car model "+ carModel+" with "+ insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancel the insurance "+insuranceName+" for car model "+carModel);
    }
}

class Pet extends InsuranceTask1{
    String petType;

    Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    public void getQuote() {
        System.out.println("Gets a quote for my "+ petType+" with "+ insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancel the insurance "+insuranceName+" for pet "+petType);
    }
}

class Health extends InsuranceTask1{

    Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote() {
        System.out.println("Gets a quote for "+ insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancel the insurance "+insuranceName);
    }
}
