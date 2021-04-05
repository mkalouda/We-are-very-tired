package com.reviewClass7;

public class Demo3 {

    int summTheOdds (int[]arr){
        int sum = 0;

        for (int num:arr){
            if(num%2!=0){
                sum+=num;
            }
        }return sum;
    }
}
