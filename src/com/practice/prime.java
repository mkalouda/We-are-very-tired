package com.practice;

import java.util.ArrayList;
import java.util.LinkedList;

class prime {
    public static void main(String[] args) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for (int i=2; i<=100;i++){
            boolean isPrime=true;
            for (int j=2; j<i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                primeNumbers.add(i);
            }
        }
        System.out.println(primeNumbers);
    }
}


