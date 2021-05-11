package com.reviewclass10;

import java.util.ArrayList;

public class FunctionalProgramming2 {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("DC");
        cities.add("Chicago");
        cities.add("Orlando");
        cities.add("Palm Beach");
        cities.add("LA");
        cities.add("Chicago");
        System.out.println(cities);

        int counter=0;
        for(String city:cities){
            if(city.contains("C")){
                counter++;
            }
        }
        System.out.println(counter);

        System.out.println(cities.stream().filter(city->city.contains("C")).count());
    }
}
