package com.class23.Recap;

public class class23Task3 {

    static void printInfo(String name){
        System.out.println(name);
    }

    static void printInfo(String name, String address){
        System.out.println(name+" "+ address);
    }

    static void printInfo(String name, String address, String phoneNumber){
        System.out.println(name+" "+address+" "+phoneNumber);
    }

    public static void main(String[] args) {
        printInfo("munz");
        printInfo("munz", "123 wallaby way");
        printInfo("munz", "123 wallaby way", "234-343-3231");
    }
}
