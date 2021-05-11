package com.class32;

import java.util.LinkedHashSet;
import java.util.Set;

public class HW5 {
    public static void main(String[] args) {
        Set<String> values = new LinkedHashSet<>();
        values.add("Hello");
        values.add("how");
        values.add("are");
        values.add("you");

        String sentence="";
        for(String val:values){
            sentence+=val+" ";
        }
        System.out.println(sentence);
    }
}
