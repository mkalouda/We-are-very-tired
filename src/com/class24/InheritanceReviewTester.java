package com.class24;

public class InheritanceReviewTester {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.salary=100000;
        employee.getPaid();
        employee.goOnLeave();

        System.out.println();

        Contractor contractor = new Contractor();
        contractor.getPaid();

        //widening or upcasting
        Employee contractor2 = new Contractor();

        //narrowing or downcasting
        Contractor contractor3=(Contractor) new Employee();
    }
}
