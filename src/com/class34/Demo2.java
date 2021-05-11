package com.class34;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo2 {
    public static void main(String[] args) throws FileNotFoundException {
        int[] arr ={10,20};
        try{
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("out of Bound");
        }

        String name =null;

        if (name!=null){
            name.length();
        }else {
            System.out.println("Null object");
        }

        String path = "/Users/mariamosman/Desktop/Book1.xlsx";

        File file = new File(path);
        if (file.exists()){
            FileInputStream fileInputStream = new FileInputStream(path);
        }else {
            System.out.println("File not found");
        }

    }
}
