package com.reviewclass11;

import java.util.HashMap;
import java.util.Set;

public class Employee {
    public static void main(String[] args) {
        HashMap<String,Integer> empMap= new HashMap<>();
        empMap.put("Moe Smith", 123);
        empMap.put("Joe Smith", 100000);
        empMap.put("Alec Diaz", 80000);
        empMap.put("Jen Lopez", 30000);

        Set<String> empKeys = empMap.keySet();

        Integer maxSalary=Integer.MIN_VALUE;
        String maxSalaryKey="";

        for(String emp:empKeys){
            if(empMap.get(emp)>maxSalary){
                maxSalary=empMap.get(emp);
                maxSalaryKey=emp;
            }
        }
        System.out.println(maxSalaryKey+":"+maxSalary);
    }
}
