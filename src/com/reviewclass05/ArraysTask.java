package com.reviewclass05;

import java.util.Scanner;

public class ArraysTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum=0;

        System.out.println("How many numbers will you like to add");
        int size= scan.nextInt();
        double[] numbers=new double[size];

        System.out.println("Please add the numbers below:");
        for (int i=0; i<size; i++){
            numbers[i]=scan.nextDouble();
            sum += numbers[i];
        }
        System.out.println(sum);





    }
}
