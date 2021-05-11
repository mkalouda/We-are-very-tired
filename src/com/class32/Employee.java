package com.class32;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Employee {
    public static void main(String[] args) {
        Map<String, Integer> employee = new HashMap<>();
        employee.put("Dylan", 10000);
        employee.put("Bob", 50000);
        employee.put("Dan", 90000);
        employee.put("Suzie", 85000);
        employee.put("John Smith", 100000);

        Set<Map.Entry<String,Integer>> roster = employee.entrySet();
        int highest=0;
        String emp="";
        for (Map.Entry<String,Integer> list:roster){
            if(list.getValue()>highest){
                highest= list.getValue();
                emp= list.getKey();
            }
        }
        System.out.println(emp+"="+highest);

    }
}
