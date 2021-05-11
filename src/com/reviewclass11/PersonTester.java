package com.reviewclass11;

import java.util.Collection;
import java.util.TreeMap;

public class PersonTester {
    public static void main(String[] args) {
        TreeMap<Integer, Person> treeMap = new TreeMap<>();
        treeMap.put(1,new Person("dan","tom",23,423322));
        treeMap.put(2,new Person("Tom","Sanchez",33,20000));
        treeMap.put(3,new Person("ALex","Lee",64,1000000));
        treeMap.put(4,new Person("Malik","Yo",22,300000));

        Collection<Person> personCollection = treeMap.values();
        for(Person person:personCollection){
            person.printDetails();
        }
    }
}
