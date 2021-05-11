package com.class30;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HW5 {
    public static void main(String[] args) {
        Set<String> cities = new LinkedHashSet<>();
        cities.add("Alexandria");
        cities.add("Baltimore");
        cities.add("Arlington");
        cities.add("Sterling");
        cities.add("Reston");
        cities.add("Herndon");
        cities.add("Springfield");

        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()){
            String var = iterator.next();
            if(var.startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println(cities);
    }
}
