package com.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo6 {
    public static void main(String[] args) {
        String path = "/Users/mariamosman/Desktop/Book1.xlsx";
        FileInputStream fileInputStream=null;
        try {
            fileInputStream = new FileInputStream(path);
            System.out.println("Next line of code");
        }catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }finally {
            try {
                System.out.println("Will always be executed");
                fileInputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        System.out.println(10/0);
    }
}
