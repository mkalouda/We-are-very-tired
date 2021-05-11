package com.class28.demo3;

public class PersonTester {
    public static void main(String[] args) {
        SyntaxEmployee syntaxEmployee = new Emp();
        syntaxEmployee.sleep();
        syntaxEmployee.eat();
        syntaxEmployee.work();
        syntaxEmployee.teach();

        System.out.println();

        Person person = new Emp();
        person.eat();
        person.sleep();
    }
}
