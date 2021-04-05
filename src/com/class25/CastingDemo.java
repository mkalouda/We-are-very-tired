package com.class25;

import com.class25.Overriding.Child;
import com.class25.Overriding.Father;

public class CastingDemo {
    public static void main(String[] args) {
        Father father = new Child("Munz");  //upcasting

        Child child =(Child) father; //downcasting
    }
}
