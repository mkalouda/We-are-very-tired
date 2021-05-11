package com.class28.GroupExercise;

public class ShapeTester {
    public static void main(String[] args) {
        Circle circle= new Circle(4);
        circle.calculateArea();
        circle.calculatePerimeter();

        System.out.println();

        Square square= new Square(5);
        square.calculateArea();
        square.calculatePerimeter();
    }
}
