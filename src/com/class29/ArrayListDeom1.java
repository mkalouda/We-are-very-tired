package com.class29;

import java.util.ArrayList;

public class ArrayListDeom1 {
    public static void main(String[] args) {
        ArrayList<String> subjcts = new ArrayList<>();
        subjcts.add("SDLC");
        subjcts.add("Manual Testing");
        subjcts.add("Java");
        subjcts.add("Git");
        subjcts.add("Selenium");
        subjcts.add("TestNG");
        System.out.println(subjcts);

        for(String subject:subjcts){
            System.out.println(subject);
        }

        subjcts.remove("Selenium");
        System.out.println(subjcts);

        subjcts.add(4,"Selenium");
        System.out.println(subjcts);
    }
}
