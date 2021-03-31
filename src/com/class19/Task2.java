package com.class19;

public class Task2 {
    /*
    Write a java program of Class Students that takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.
    NOTE: please use different names for instance and local variables.
     */

    String name;
    int grade1;
    int grade2;
    int grade3;
    int averageGrade;

    Task2(String name, int grade1, int grade2, int grade3, int averageGrade){
        this.name=name;
        this.grade1=grade1;
        this.grade2=grade2;
        this.grade3=grade3;
        this.averageGrade=averageGrade;
    }

    void printAverage(){
        averageGrade=(grade1+grade2+grade3)/3;
    }

}


