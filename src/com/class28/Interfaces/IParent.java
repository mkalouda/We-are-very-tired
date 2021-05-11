package com.class28.Interfaces;

public interface IParent {

    //private int number=10; Error cuz all variables in interfaces are public

    public static final int number=10;  // no need to make the variables as public static and final because they are
                                        // already public static final

    /*IParent(){

    }*/ // interfaces can not have constructors buz they dont have instance fields

    void method1();
}

interface IParent2{
    void method2();
}

class AdvancedChild implements IParent,IParent2{

    @Override
    public void method1() {
        System.out.println("From IParent");
    }

    @Override
    public void method2() {
        System.out.println("From IParent2");
    }
}
