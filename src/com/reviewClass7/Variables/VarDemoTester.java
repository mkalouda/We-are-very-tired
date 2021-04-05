package com.reviewClass7.Variables;

public class VarDemoTester {
    public static void main(String[] args) {

        int[] arr={10,20,30,40};

        VarDemo varDemo = new VarDemo(arr);
        //varDemo.getSum();
        varDemo.calculateAverage();
        varDemo.printMax();
        varDemo.printMin();
        varDemo.sort2DArray();
    }
}
