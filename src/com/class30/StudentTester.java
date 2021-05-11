package com.class30;

import java.util.ArrayList;

public class StudentTester {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Bob", 35));
        students.add(new Student(2, "Tom", 5));
        students.add(new Student(3, "Carl", 3));
        students.add(new Student(4, "Moe", 36));
        Student student = new Student(4, "Moe", 36);
        Student student1 = new Student(1, "Bob", 35);
        Student student2 = new Student(3, "Carl", 3);
        System.out.println(students);
        students.remove(student);
        students.remove(student1);
        students.remove(student2);
        System.out.println(students);
    }
}
