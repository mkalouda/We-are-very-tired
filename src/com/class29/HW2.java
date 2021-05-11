package com.class29;

import java.util.ArrayList;

public class HW2 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Mercedes");

        System.out.println(cars);

        for(String car:cars){
            System.out.println(car);
        }
        System.out.println("------------------------");
        for(int i=0; i< cars.size();i++){
            System.out.println(cars.get(i));
        }
    }
}
