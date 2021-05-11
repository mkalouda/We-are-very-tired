package com.class31;

import java.util.*;

public class Demo4 {
    public static void main(String[] args) {
        HashMap<String,Double> groceries = new LinkedHashMap<>();
        groceries.put("eggs", 12.0);
        groceries.put("Milk", 15.0);
        groceries.put("Tomato", 35.0);
        groceries.put("Potato", 10.0);

        Set<Map.Entry<String,Double>> entrySet =groceries.entrySet();
        LinkedList<Map.Entry<String,Double>> linkedList = new LinkedList<>(entrySet);
        for(Map.Entry<String,Double> entry:linkedList){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
