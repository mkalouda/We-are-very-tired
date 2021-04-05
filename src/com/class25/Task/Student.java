package com.class25.Task;

public class Student {

    void study(){
        System.out.println("Student must study");
    }
    void doHomeWork(){
        System.out.println("Students must complete homework");
    }
    void practice(){
        System.out.println("Students must practice");
    }
}
class SyntaxStudent extends Student{

    void doHomeWork(){
        System.out.println("Syntax Students must complete homework to succeed ang get job");
    }
    void practice(){
        System.out.println("Syntax Students must practice additional 15 hours");
    }
    void doResearch(){
        System.out.println("Syntax Students must do their own research");
    }
}
class CollegeStudent extends Student{

    void doHomeWork(){
        System.out.println("College Students must complete homework to get good grades");
    }
}
class SchoolStudent extends Student{

}