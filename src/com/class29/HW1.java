package com.class29;

import java.util.ArrayList;

public class HW1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Mariam");
        list.add("Munz");
        list.add("Douha");
        list.add("Bob");
        list.add("Tom");

        System.out.println(list.isEmpty());
        System.out.println(list.contains("Munz"));
        System.out.println(list.size()+" "+ list);

    }
}
