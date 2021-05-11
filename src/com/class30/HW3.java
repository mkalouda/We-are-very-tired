package com.class30;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HW3 {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        Set<String> set = new LinkedHashSet<>(aList);
        ArrayList<String> removedNames = new ArrayList<>(set);
        System.out.println(removedNames);
    }
}
