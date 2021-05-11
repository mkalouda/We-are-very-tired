package com.reviewclass07.Variables;

public class StaticDemoTester {
    public static void main(String[] args) {
        StaticDemo staticDemo1 = new StaticDemo();
        StaticDemo staticDemo2 = new StaticDemo();
        StaticDemo staticDemo3 = new StaticDemo();
        StaticDemo staticDemo4 = new StaticDemo();

        StaticDemo.printTotalObjectCreated();
    }
}
