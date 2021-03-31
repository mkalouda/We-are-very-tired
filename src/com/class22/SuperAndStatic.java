package com.class22;

public class SuperAndStatic {
    String color;

    static void printInfo(){
        //color ="fsfds"; cant use instance in a static method
        //System.out.println(color); wouldnt no which color to print
    }

    public static void main(String[] args) {
        SuperAndStatic superAndStatic = new SuperAndStatic();
        superAndStatic.color="Red";
        SuperAndStatic superAndStatic1 = new SuperAndStatic();
        superAndStatic.color="White";
        SuperAndStatic superAndStatic2 = new SuperAndStatic();
        superAndStatic.color="Black";

        superAndStatic.printInfo();
    }
}

class parent1{
    String color;
}
