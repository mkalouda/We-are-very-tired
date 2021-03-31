package com.class23.Recap;

public class ProgrammingTask2 {

    ProgrammingTask2(){
        System.out.println("I love programming languages");
    }

    ProgrammingTask2(String value){
        System.out.println("I love "+ value);
    }

    public static void main(String[] args) {
        new ProgrammingTask2();
        new ProgrammingTask2("c++");
    }
}
