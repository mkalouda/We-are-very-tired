package com.practice;

import java.util.*;

public class Repl {
    public static void main(String[] args) {
        List<Map<String,Object>> dataList = new ArrayList<>();

        Map<String,Object> appleMap = new HashMap<>();
        appleMap.put("Items","Apple");
        appleMap.put("Price",20);
        appleMap.put("Quantity", 10);

        dataList.add(appleMap);

        Map<String,Object> orangeMap = new HashMap<>();
        orangeMap.put("Items","Orange");
        orangeMap.put("Price",21.99);
        orangeMap.put("Quantity", 10);

        dataList.add(orangeMap);

    }
}
