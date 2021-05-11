package com.reviewclass10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArraysList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList();
        cities.add("Marrakech");
        cities.add("Chicago");
        cities.add("Orlando");
        cities.add("Palm Beach");
        cities.add("Casablanca");
        cities.add("Chicago");

        ListIterator<String> stringListIterator = cities.listIterator();
        System.out.println(stringListIterator.next());
        System.out.println(stringListIterator.previous());
    }
}
