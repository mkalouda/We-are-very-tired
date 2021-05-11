package com.reviewclass10;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Marrakech");
        cities.add("Chicago");
        cities.add("Orlando");
        cities.add("Palm Beach");
        cities.add("Casablanca");
        cities.add("Chicago");

        int index = cities.indexOf("Orlando");
        cities.add(index, "New York");

        cities.add(0,"Alexandria");
        System.out.println(cities);

        System.out.println(cities.size());

        System.out.println(cities.contains("Chicago"));

        System.out.println(cities.indexOf("Chicago"));
        System.out.println(cities.lastIndexOf("Chicago"));

        System.out.println(cities.set(1, "LA"));
        System.out.println(cities);

        System.out.println(cities.remove("Chicago"));
        System.out.println(cities);

        System.out.println(cities.remove(1));
        System.out.println(cities);

        int firstIndex=2;
        int lastIndex=3; //last index is exclusive
        System.out.println("====sublist====");
        ArrayList<String> limitedcities = new ArrayList<>(cities.subList(firstIndex, lastIndex));
        System.out.println(limitedcities);



    }
}
