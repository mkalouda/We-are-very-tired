package com.class23.Recap;

public class class23Task4 {

    private void printInfo(String name){
        System.out.println(name);
    }

    private void printInfo(String name, String address){
        System.out.println(name+" "+ address);
    }

    private void printInfo(String name, String address, String phoneNumber){
        System.out.println(name+" "+address+" "+phoneNumber);
    }

    public static void main(String[] args) {
        class23Task4 sample = new class23Task4();
        sample.printInfo("munz");
        sample.printInfo("munz", "123 wallaby way");
        sample.printInfo("munz", "123 wallaby way", "234-343-3231");
    }
}
