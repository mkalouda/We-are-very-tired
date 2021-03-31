package com.class22.methodOverloading;

public class Demo2 {

    /*void add(int a, int b){
        System.out.println(a+b);
    }
    void add(double a, double b){
        System.out.println(a+b);
    }
    void add(double a, int b){
        System.out.println(a+b);
    }
    void add(double a, int b, int c){
        System.out.println(a+b+c);
    }*/
   /* void add (int[] arr){
        int sum=0;
        for (int num:arr){
            sum+=num;
        }
        System.out.println(sum);
    }*/

     void add (int ...arr){
        int sum=0;
        for (int num:arr){
            sum+=num;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        /*demo2.add(10,10);
        demo2.add(10.5,10.5);
        demo2.add(10.5,10);
        demo2.add(10.5,10,10);
        int[] arr = {10,10,10};
        demo2.add(arr);*/

        int[] arr={10,12,13};
        demo2.add(arr);
        demo2.add(10);
        demo2.add(10,10,10);
    }
}
