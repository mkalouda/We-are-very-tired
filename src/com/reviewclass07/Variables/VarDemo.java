package com.reviewclass07.Variables;

import java.util.Arrays;
import java.util.Scanner;

public class VarDemo {

    int[] arr;
    Scanner scan;

    VarDemo(int[] arr){
        this.arr=arr;
        scan= new Scanner(System.in);
    }

    public int getSum(){
        int sum=0;
        for(int number:arr){
            sum+=number;
        }
        return sum;
    }
    public void calculateAverage(){
        System.out.println(getSum()/ arr.length);
    }
    public void printMax(){
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
    public void printMin(){
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }

    public void sort2DArray(){
        int [][] arr2={
                {1,5,6},
                {7,4,2},
        };
        Arrays.sort(arr2[0]);
        Arrays.sort(arr2[1]);
        for (int[] arr:arr2){
            for(int a:arr){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
