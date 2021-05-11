package com.class29;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> subjcts = new ArrayList<>();
        subjcts.add("SDLC");
        subjcts.add("Manual Testing");
        subjcts.add("Java");
        subjcts.add("Git");
        subjcts.add("Selenium");
        subjcts.add("TestNG");

        System.out.println(subjcts);

        ArrayList<String> subjctsThatWeWantToRemove = new ArrayList<>();
        subjctsThatWeWantToRemove.add("SDLC");
        subjctsThatWeWantToRemove.add("Manual Testing");
        subjctsThatWeWantToRemove.add("Java");

        subjcts.removeAll(subjctsThatWeWantToRemove);
        System.out.println(subjcts);

    }
}
