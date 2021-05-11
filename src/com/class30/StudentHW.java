package com.class30;

import java.util.HashSet;
import java.util.Set;

public class StudentHW {

    String name;
    int studentID;

    public StudentHW(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "StudentHW{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Main{
    public static void main(String[] args) {
        StudentHW student1 = new StudentHW("moe",123);
        StudentHW student2 = new StudentHW("munz", 1234);
        StudentHW student3 = new StudentHW("tom", 433);
        StudentHW student4 = new StudentHW("bob", 75345);
        StudentHW student5 = new StudentHW("el", 157633);

        Set<StudentHW> StudentHW = new HashSet<>();
        StudentHW.add(student1);
        StudentHW.add(student2);
        StudentHW.add(student3);
        StudentHW.add(student4);
        StudentHW.add(student5);

        System.out.println(StudentHW);
    }
}
