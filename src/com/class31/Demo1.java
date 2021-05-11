package com.class31;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        System.out.println(treeSet);
        treeSet.add("AB");
        treeSet.add("ab");
        System.out.println(treeSet);

    }
}
