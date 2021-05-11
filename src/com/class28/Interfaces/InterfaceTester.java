package com.class28.Interfaces;

public class InterfaceTester {
    public static void main(String[] args) {
        //IParent iParent = new IParent(); can not create objects

        IParent iParent = new AdvancedChild();
        iParent.method1();
        //iParent.method2(); CE
    }
}
