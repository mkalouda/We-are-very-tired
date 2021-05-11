package com.reviewclass07.Variables;

public class StaticDemo {

    static int sum;

    StaticDemo(){
        sum++;
    }

    static void printTotalObjectCreated(){
        System.out.println(sum);
    }
}
