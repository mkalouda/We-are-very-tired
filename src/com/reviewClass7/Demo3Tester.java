package com.reviewClass7;

public class Demo3Tester {
    public static void main(String[] args) {
        Demo3 demo3 = new Demo3();
        int[] numbers={1,2,3,4,5};
        if(demo3.summTheOdds(numbers)>2){
            System.out.println("Sum is greater than 2");
            System.out.println(demo3.summTheOdds(numbers));
        }
    }
}
