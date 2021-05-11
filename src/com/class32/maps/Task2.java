package com.class32.maps;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Map<String,String> countries=new TreeMap<>();
        countries.put("Ukraine","Kiev");
        countries.put("United States","Washington DC");
        countries.put("Albania","Tirana");
        countries.put("Algeria","Algiers");
        countries.put("Angola","Luanda");
        countries.put("Mali","Bamako");
        countries.put("Malta","Valletta");
        countries.put("Mexico","Mexico City");
        countries.put("Morocco","Rabat");
        countries.put("Nepal","Kathmandu");

        Set<String> mapCountries=countries.keySet();
        for(String key:mapCountries){
            System.out.println(key+": "+countries.get(key));
        }
        System.out.println("------------------------------------------------");

        Iterator<String> iterator = countries.keySet().iterator();
        while (iterator.hasNext()){
            String country = iterator.next();
            System.out.println(country+": "+ countries.get(country));
        }
        System.out.println("-------------------get it from value---------------------------");

        Collection<String> values=countries.values();
        for(String value:values){
            System.out.println(value);
        }
        System.out.println("------------------------------------------------");

        Iterator<String> iterator1 = countries.values().iterator();
        while (iterator1.hasNext()){
            String capitol = iterator1.next();
            System.out.println(capitol);
        }
    }
}
