package com.class32;

import java.util.ArrayList;

public class HW6 {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(10);
        values.add(20);
        values.add(4);
        values.add(100);
        values.add(100);

        int sum=0;
        for(Integer val:values){
            sum+=val;
        }
        System.out.println(sum);
    }
}
