package com.class26;

public class Task1 {
    final int number;
    Task1(int number){
        this.number=number;
    }    // can initialize using constructor

    /*void init(int number){
        this.number=number;
    }*/  //CAN NOT INITIALIZE WITH METHOD

    public static void main(String[] args) {
        final Task1 task1 = new Task1(10);
        //var1 = new Task1(9); CE

        final int[] a={10,20};
        //a={20,30}; CE
        a[0]=9;
    }
}
