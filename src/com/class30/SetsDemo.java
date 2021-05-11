package com.class30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetsDemo {
    public static void main(String[] args) {
        Set <String> names = new HashSet<>();
        names.add("Afzal");
        names.add("Gul");
        names.add("Yarina");
        names.add("Caner");
        names.add("Ty");
        names.add("Gul");

        System.out.println(names);

        for(String name:names){
            System.out.print(name+ " ");
        }

        System.out.println();

        ArrayList<String> listFromSet = new ArrayList<>(names);
        for(int i=0;i< names.size();i++){
            System.out.print(listFromSet.get(i)+" ");
        }
    }
}
