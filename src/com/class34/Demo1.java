package com.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo1 {
    public static void main(String[] args) {
        String path = "/Users/mariamosman/Desktop/Book1.xlsx";

        System.out.println("Important code");
        System.out.println("Important code");
        System.out.println("Important code");

        try{
            System.out.println("Inside try block");
            FileInputStream fileInputStream = new FileInputStream(path);
            String name = null;
            name.length();
        } catch (FileNotFoundException fileNotFoundException){
            System.out.println("The file that you are trying to read "+path+" is not present");
        }catch (NullPointerException nullPointerException){
            System.out.println("Catch block");
        }

        System.out.println("Important code after try catch");
        System.out.println("Important code after try catch");

    }
}
