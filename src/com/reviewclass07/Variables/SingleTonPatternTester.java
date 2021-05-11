package com.reviewclass07.Variables;

public class SingleTonPatternTester {

    public static void main(String[] args) {
        SingleTonPattern singleTonPattern= SingleTonPattern.getObj();
        SingleTonPattern.getObj();
        SingleTonPattern.getObj();
        SingleTonPattern.getObj();
        System.out.println(SingleTonPattern.sum);

    }

}
