package com.reviewClass7;

public class MethodDemo2 {

    static void methodWithStatic(){
        System.out.println("Can call me by just using the name of the class");
    }

    void instanceMethod(){
        System.out.println("You need an object of my class if you want to call me outside this class" +
                " or in the static methods");
    }

    void instanceMethod2(){
        methodWithStatic();
        instanceMethod();
        String [] a={"bla bla"};
        main(a);
    }

    public static void main(String[] args) {
        methodWithStatic();

        MethodDemo2 methodDemo2 = new MethodDemo2();
        methodDemo2.instanceMethod();
    }
}
