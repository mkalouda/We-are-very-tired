package com.class30;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HW4 {
    public static void main(String[] args) {
        Set<String> countries = new TreeSet<>();
        countries.add("USA");
        countries.add("Egypt");
        countries.add("Mexico>");
        countries.add("Argentina");
        countries.add("Morocco");
        countries.add("Brazil");

        System.out.println(countries);

        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()){
            iterator.next();
        }
        System.out.println(countries);
    }
}
