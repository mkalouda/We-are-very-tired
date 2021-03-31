package com.class19;

public class Task2Tester {
    public static void main(String[] args) {

        Task2 student1 = new Task2("munz",70,70,0,100);
        student1.printAverage();
        System.out.println(student1.name);
        System.out.println(student1.grade1);
        System.out.println(student1.grade2);
        System.out.println(student1.grade3);
        System.out.println(student1.averageGrade);

        Task2 student2 = new Task2("luda",100,98,88,100);
        student2.printAverage();
        System.out.println(student2.name);
        System.out.println(student2.grade1);
        System.out.println(student2.grade2);
        System.out.println(student2.grade3);
        System.out.println(student2.averageGrade);

        Task2 student3 = new Task2("moe",70,80,90,100);
        student3.printAverage();
        System.out.println(student3.name);
        System.out.println(student3.grade1);
        System.out.println(student3.grade2);
        System.out.println(student3.grade3);
        System.out.println(student3.averageGrade);

        Task2 student4 = new Task2("sam",85,85,85,100);
        student4.printAverage();
        System.out.println(student4.name);
        System.out.println(student4.grade1);
        System.out.println(student4.grade2);
        System.out.println(student4.grade3);
        System.out.println(student4.averageGrade);
    }
}
