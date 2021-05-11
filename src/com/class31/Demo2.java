package com.class31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Azizi");
        arrayList.add("Ram");
        arrayList.add("Danilo");
        arrayList.add("Mike");
        arrayList.indexOf("Mike");

        Map<Integer,String> map = new HashMap<>();
        map.put(123456, "Azizi");
        map.put(123454, "Ram");
        map.put(234352, "Danilo");
        map.put(645623, "Mike");
        map.put(645623, "Jon"); //will replace it

        System.out.println(map.get(234352));
        System.out.println(map);

        Map<Integer,String> map2 = new HashMap<>();
        map.put(123, "MJ");
        map.put(1254, "tod");
        map.put(24352, "Ysa");
        map.put(45623, "KJ");

        map2.putAll(map);
        System.out.println(map2);

        map2.remove(1254);
        System.out.println(map2);

        System.out.println(map2.get(123));
    }
}
