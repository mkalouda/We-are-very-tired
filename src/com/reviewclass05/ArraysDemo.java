package com.reviewclass05;

public class ArraysDemo {

    public static void main(String[] args) {

       /*
       We use variables to hold single values
       different primitive data types -> byte, short, int, long, double, float, char, boolean
        */

        int num = 10;

        String [] names = new String[10];
        names[0]= "Alina";
        names[1]= "Monika";
        names[2]= "Azizi";

        int [][] numbers = new int[5][5];
        numbers[0][0]=12;
        numbers[0][1]=20;
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

    }
}
