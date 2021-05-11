package com.class32.maps;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Map<Integer, String> bestBuy= new LinkedHashMap<>();
        bestBuy.put(123456, "Printer");
        bestBuy.put(334678, "TV");
        bestBuy.put(543278, "Phone");
        bestBuy.put(975452, "Blender");
        bestBuy.put(241646, "Case");

        Set<Map.Entry<Integer,String>> entrySet = bestBuy.entrySet();
        for(Map.Entry<Integer,String> entry:entrySet){
            System.out.println(entry);
        }
        System.out.println("---------------------------------------");

        Iterator<Map.Entry<Integer,String>> iterator = bestBuy.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> entry = iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
