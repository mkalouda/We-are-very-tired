package com.class31;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class HW2 {
    public static void main(String[] args) {
        Map<Integer,String> bestBuy = new HashMap<>();
        bestBuy.put(7664847, "Printer");
        bestBuy.put(7879885, "TV");
        bestBuy.put(234543, "Phone");
        bestBuy.put(835839, "Tablet");

        Set<Map.Entry<Integer,String>> entrySet = bestBuy.entrySet();
        LinkedList<Map.Entry<Integer,String>> linkedList = new LinkedList<>(entrySet);
        for(Map.Entry<Integer,String> entry:entrySet){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }

    }
}
