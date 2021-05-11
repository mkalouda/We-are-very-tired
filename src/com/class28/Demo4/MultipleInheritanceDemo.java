package com.class28.Demo4;

public class MultipleInheritanceDemo extends Parent2 {

}
class Parent1{
    void method(){
        System.out.println("Method from parent1");
    }
}

class Parent2{
    void method(){
        System.out.println("Method from parent2");
    }
}

class Tester{
    public static void main(String[] args) {
        MultipleInheritanceDemo multipleInheritanceDemo=new MultipleInheritanceDemo();
        multipleInheritanceDemo.method();
    }
}


