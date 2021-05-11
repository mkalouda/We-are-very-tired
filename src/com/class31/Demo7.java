package com.class31;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Demo7 {
    public static void main(String[] args) {
        HashMap<String,Double> groceries = new LinkedHashMap<>();
        groceries.put("eggs", 12.0);
        groceries.put("Milk", 15.0);
        groceries.put("Tomato", 35.0);
        groceries.put("Potato", 10.0);
        System.out.println(groceries);

        Set<String> mapKeys = groceries.keySet();
        Iterator<String> iterator = mapKeys.iterator();
        //Iterator<String> iterator = groceries.keySet().iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            Double value = groceries.get(key);
            if(value<=15){
                iterator.remove();
            }
        }
        System.out.println(groceries);
    }
}
