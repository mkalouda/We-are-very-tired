package com.class34;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HW2 {

    public static List<Exception> list(){
        List<Exception> exceptionList = new LinkedList<>();
        try {
            System.out.println(10/0);
        }catch (ArithmeticException arithmeticException){
            exceptionList.add(arithmeticException);
        }

        try {
            int[] arr ={20,5,3};
            System.out.println(arr[5]);
        }catch (IndexOutOfBoundsException indexOutOfBoundsException){
            exceptionList.add(indexOutOfBoundsException);
        }

        try {
            String name = null;
            System.out.println(name.length());
        }catch (NullPointerException nullPointerException){
            exceptionList.add(nullPointerException);
        }

        try {
            int num = Integer.parseInt("String");
            System.out.println(num);
        }catch (NumberFormatException numberFormatException) {
            exceptionList.add(numberFormatException);
        }

        return exceptionList;
    }


    public static void main(String[] args) {
        for(Exception ex:list()){
            System.out.println(ex.getMessage()); // only description of errors
            System.out.println(ex); // package name + class name + description
            ex.printStackTrace(); // complete stacktrace
        }
    }
}
