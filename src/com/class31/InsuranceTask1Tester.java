package com.class31;

import java.util.ArrayList;

public class InsuranceTask1Tester {
    public static void main(String[] args) {
        Car car = new Car("Geico", "Tesla");
        Pet pet = new Pet("PetHealth","Dog");
        Health health = new Health("Cigna");

        ArrayList<InsuranceTask1> arrayList = new ArrayList<>();
        arrayList.add(car);
        arrayList.add(pet);
        arrayList.add(health);

        for(InsuranceTask1 insurance: arrayList){
            insurance.getQuote();
            insurance.cancelInsurance();
        }
    }
}
