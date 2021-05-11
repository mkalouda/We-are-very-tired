package com.class32.maps;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class MapsDemo4 {
    public static void main(String[] args) {
        LinkedHashMap<String,Double> items = new LinkedHashMap<>();
        items.put("soap", 5.2);
        items.put("shirt", 10.3);
        items.put("pillow", 12.0);
        items.put("blanket", 8.3);
        System.out.println(items);

        Iterator<Double> iterator = items.values().iterator();
        /*Collection<Double> values = items.values();
        Iterator<Double> iterator = values.iterator();*/
        while (iterator.hasNext()){
            Double val = iterator.next();
            if(val<10.0){
                iterator.remove();
            }
        }
        System.out.println(items);
    }
}
