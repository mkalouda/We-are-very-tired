package com.class31;

import com.class15.Hw3;
import com.practice.Person;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class HW3 {
   private String firstName;
   private String lastName;
   private int age;
   private double salary;

    public HW3(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void print(){
        System.out.println(firstName+" "+lastName+" "+ age+" "+salary);
    }

    @Override
    public String toString() {
        return "HW3{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

class Test{
    public static void main(String[] args) {
        Map<String,HW3> employees = new TreeMap<>();
        employees.put("A34234",new HW3("Alex","lin",23,100011));
        employees.put("B32352",new HW3("Moe","Ali",43,5000000));
        employees.put("A32454",new HW3("Tom","Dan",33,2000000));
        employees.put("F435342",new HW3("Bob","Bob",42,1005000));

       Set<Map.Entry<String,HW3>> emplyeeInfo = employees.entrySet();

       for(Map.Entry<String,HW3> employee: emplyeeInfo){
           System.out.println(employee.getKey()+" "+employee.getValue());
       }
    }
}
