package com.class28.GroupExercise;

public class CarTester {
    public static void main(String[] args) {
        Truck truck= new Truck(50000.250,"Red", 2500);
        truck.display();

        System.out.println();

        Sedan sedan=new Sedan(30000, "Black", 17);
        sedan.display();
    }
}
