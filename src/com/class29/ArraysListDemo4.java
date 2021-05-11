package com.class29;

import java.util.ArrayList;

public class ArraysListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> subjcts = new ArrayList<>();
        subjcts.add("SDLC");
        subjcts.add("Manual Testing");
        subjcts.add("Java");
        System.out.println(subjcts.contains("SDLC"));
        System.out.println(subjcts.contains("Selenium"));
    }
}
