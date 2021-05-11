package com.practice;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        try {
            checkStudentgrade(91);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void checkStudentgrade(int grade) throws StudentGradeException {
        if (grade>90){
            throw new StudentGradeException("You are an exceptionally awesome student");
        }else {
            System.out.println("you are a great student");
        }
    }
}
