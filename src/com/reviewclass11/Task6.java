package com.reviewclass11;

import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(22);
        arrayList.add(59);
        arrayList.add(100);
        arrayList.add(100);

        Integer sum=0;
        for (Integer num:arrayList){
            sum+=num;
        }
        System.out.println(sum);
    }
}
