package com.class29;

import java.util.ArrayList;

public class ArraysListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> subjcts = new ArrayList<>();
        subjcts.add("SDLC");
        subjcts.add("Manual Testing");
        subjcts.add("Java");
        System.out.println(subjcts);

        ArrayList<String> subjcts2 = new ArrayList<>();
        subjcts2.add("Git");
        subjcts2.add("Selenium");
        subjcts2.add("TestNG");

        subjcts.addAll(2, subjcts2);
        System.out.println(subjcts);

        subjcts.clear();
        System.out.println(subjcts);


    }
}
