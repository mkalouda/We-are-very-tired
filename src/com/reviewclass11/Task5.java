package com.reviewclass11;

import java.util.LinkedHashSet;
import java.util.Set;

public class Task5 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Good");
        set.add("morning");
        set.add("sir");
        set.add("Good");

        StringBuilder var = new StringBuilder();
        for(String name:set){
            var.append(name);
        }
        System.out.println(var);
    }
}
