package com.class32;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Person {

    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    String userDetails(){

        return "Name: "+name+" "+lastName+" Age: "+age+" Salary: "+salary;
    }

}

class Test{
    public static void main(String[] args) {

        Map<String,Person> information = new TreeMap<>();
        information.put("A5333",new Person("Moe", "Ali", 33,100000));
        information.put("J78578",new Person("Tom", "Jones", 24,105000));
        information.put("B09443",new Person("Bob", "Motor", 53,200000));
        information.put("L3452",new Person("Sarah", "Carter", 22,100000));

       Set<Map.Entry<String,Person>> roster = information.entrySet();
       for (Map.Entry<String,Person> list:roster){
           //String person = list.getValue().userDetails();
           System.out.println("ID:"+list.getKey()+" "+list.getValue().userDetails());
        }
    }
}
