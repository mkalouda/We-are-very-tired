package com.class31;


import java.util.*;

public class HW1 {
    public static void main(String[] args) {
        Map<String,String> countries = new TreeMap<>();
        countries.put("Egypt", "Cairo");
        countries.put("Sudan", "Khartoom");
        countries.put("France", "Paris");
        countries.put("USA", "DC");

        Set<Map.Entry<String,String>> entrySet = countries.entrySet();
        //LinkedList<Map.Entry<String,String>> linkedList = new LinkedList<>(entrySet);
        for(Map.Entry<String,String> country:entrySet){
            System.out.println(country.getKey()+" "+country.getValue());
        }

        Iterator<String> iterator = countries.keySet().iterator();
        while(iterator.hasNext()){
            iterator.next();
        }
        System.out.println(countries);
    }
}
