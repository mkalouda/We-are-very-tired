package com.reviewclass05;

public class Employee {
    String name;
    String id;
    double salary;
    String department;

    void work(){
        System.out.println(name + " is working in " + department);
    }

    void drink(){
        System.out.println(name + " is drinking a lot of our coffee");
    }
}
