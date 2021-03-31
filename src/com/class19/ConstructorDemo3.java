package com.class19;

public class ConstructorDemo3 {

    String name;
    double salary;
    double bonus;
    int numberOfDaysWorked;
    double bonusPercentage;

    ConstructorDemo3(String name, double salary, int numberOfDaysWorked, double bonusPercentage){
        this.name=name;
        this.salary=salary;
        this.bonus=1000;
        this.numberOfDaysWorked=numberOfDaysWorked;
        this.bonusPercentage=bonusPercentage;
    }

    void printBonus(){

        if(numberOfDaysWorked>300){
            bonus=1000;
        }else{
            bonus=500;
        }
    }

    public static void main(String[] args) {

        ConstructorDemo3 obj2 = new ConstructorDemo3("Munz",100000,300,100);
        obj2.printBonus();
        System.out.println(obj2.name);
        System.out.println(obj2.salary);
        System.out.println(obj2.bonus);
        System.out.println(obj2.numberOfDaysWorked);
        System.out.println(obj2.bonusPercentage);



    }
}
