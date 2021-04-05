package com.class24;

public class InheritanceReview {
}

class Employee{
    double salary;

    void work(){
        System.out.println("Employee is working");
    }

    void getPaid(){
        System.out.println("Employee is getting paid "+ salary+ " and with benefits");
    }

    void goOnLeave(){
        System.out.println("Employee is going on leave");
    }
}

class FullTimeEmp extends Employee{

}

class  PartTimeEmp extends Employee{

    @Override
    void goOnLeave() {
        System.out.println("Part time employee dont go on leave");
    }
}

class Contractor extends Employee{

    @Override
    void goOnLeave() {
        System.out.println("Contractors employee dont go on leave");
    }

    @Override
    void getPaid() {
        System.out.println("Contractor employee dong receive benefits");
    }
}
