package com.class19;

public class Employee {

    private String name;
    private String empID;
    private double salary;
    private String department;

    Employee(){
        System.out.println("Important line1");
        System.out.println("Important line2");
        System.out.println("Important line3");
    }

    public Employee(String name, String empID, double salary, String department) {
        //this.name = name;
        /*this.name=validateName(name);
        this.empID = empID;
        this.salary = salary;*/
        this(name, empID, salary);
        this.department = department;

    }

    public Employee(String name, String empID, double salary) {
        //this.name = name;
       /* this.name = validateName(name);
        this.empID = empID;*/
        this(name, empID);
        this.salary = salary;
    }

    public Employee(String name, String empID) {
        //this.name = name;
        //this.name = validateName(name);
        this(name);
        this.empID = empID;
    }

    public Employee(String name) {
        this();
        //this.name = name;
        this.name = validateName(name);
    }

    void printInfo(){
        System.out.println("Name " + name + " EmployeeID " + empID);
    }

    String validateName(String name){
        if(name.length()<15){
            return name;
        }else {
            return null;
        }
    }
}
