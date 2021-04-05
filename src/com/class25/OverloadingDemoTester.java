package com.class25;

public class OverloadingDemoTester {
    public static void main(String[] args) {
        OverloadingDemo overloadingDemo = new OverloadingDemo();
        overloadingDemo.printInfo("Munz");
        overloadingDemo.printInfo("Munz", 123456, "123 wallabe way");
        overloadingDemo.printInfo("Munz", "123 wallabe way");
    }
}
