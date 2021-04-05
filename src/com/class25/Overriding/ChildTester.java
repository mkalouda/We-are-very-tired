package com.class25.Overriding;

public class ChildTester {
    public static void main(String[] args) {
        Object[] arr= {new String("test"), new Child("child")};
        //The parent class of all of the classes that exist in java

        /*Father father = new Father("Bob");
        father.eat();
        father.sleep();*/

       /* Father father = new Child2("Dyl");
        father.eat();
        father.sleep();*/

        //executeAllMethods(new Father("Bob"), new Child("Dyl"), new Child2("Dan"));

        Father[] father={new Father("Bob"), new Child("Dyl"), new Child2("Dan")};
        executeAllMethods(father);

    }
    static void executeAllMethods(Father father, Child child, Child2 child2){
        father.eat();
        father.sleep();
        child.eat();
        child.sleep();
        child2.eat();
        child2.sleep();
    }

    static void executeAllMethods(Father[] fatherArr){

        for (Father father:fatherArr){
            father.sleep();
            father.eat();
        }
    }
}
