package com.class28.GroupExercise;

public interface Shape {

    void calculateArea();
    void calculatePerimeter();
}

class Circle implements Shape{
    double radius;
    double area;
    double perimeter;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area= Math.PI*Math.pow(radius,2);
        System.out.println("Area of the circle is "+area);
    }

    @Override
    public void calculatePerimeter() {
        perimeter=2*Math.PI*radius;
        System.out.println("Perimeter of the circle is "+perimeter);
    }
}

class Square implements Shape{
    double area;
    double side;
    double perimeter;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        area= Math.pow(side,2);
        System.out.println("Area of the square is "+area);
    }

    @Override
    public void calculatePerimeter() {
        perimeter=4*side;
        System.out.println("Perimeter of the square is "+perimeter);
    }
}
