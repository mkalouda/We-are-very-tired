package com.class29;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> subjcts = new ArrayList<>();
        subjcts.add("SDLC");
        System.out.println("size "+subjcts.size());

        subjcts.add("Manual Testing");
        System.out.println("size "+subjcts.size());

        subjcts.add("Java");
        System.out.println("size "+subjcts.size());

        subjcts.add("Git");
        System.out.println("size "+subjcts.size());

        subjcts.add("Selenium");
        System.out.println("size "+subjcts.size());
        System.out.println(subjcts.get(2));

        subjcts.add("TestNG");
        System.out.println("size before removal "+subjcts.size());
        System.out.println(subjcts.get(5));
        // System.out.println(subjcts.get(6)); RE

        System.out.println(subjcts.indexOf("Java"));
        subjcts.remove("Git");
        System.out.println("size after removal "+subjcts.size());
    }
}
