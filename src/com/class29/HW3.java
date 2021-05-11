package com.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class HW3 {
    public static void main(String[] args) {

        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("syntax");
        subjects.add("here");
        subjects.add("java");
        subjects.add("give");
        subjects.add("Math");
        subjects.add("take");

        /*for (int i = subjects.size()-1; i >=0 ; i--) {
            if (subjects.get(i).endsWith("e")) {
                subjects.remove(i);
            }
        }
        System.out.println(subjects);*/

        Iterator<String> iterator = subjects.iterator();
        while (iterator.hasNext()){
            String var = iterator.next();
            if(var.endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(subjects);

    }
}
