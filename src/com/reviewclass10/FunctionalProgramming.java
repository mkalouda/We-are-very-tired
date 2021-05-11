package com.reviewclass10;


import java.util.ArrayList;

public class FunctionalProgramming {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("DC");
        cities.add("Chicago");
        cities.add("Orlando");
        cities.add("Palm Beach");
        cities.add("LA");
        cities.add("Chicago");
        System.out.println(cities);

        /*for (String city:cities){
            if(city.contains("C")){
                cities.remove(city);
            }
        }*/

        cities.removeIf(city -> city.contains("C"));
        System.out.println(cities);
    }
}
