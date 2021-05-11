package com.reviewclass11;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    public void printDetails(){
        System.out.println("Name: "+ firstName+" "+lastName+" Age: "+age+" Salary: "+salary);
    }
}
