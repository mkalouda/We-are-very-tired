package com.class22;

public class HW3 {
    double width;
    double length;
    double height;
    double side;

    HW3(double width, double length){
        this.width=width;
        this.length=length;
    }
    HW3(double side){
        this.side=side;
    }
    HW3(double length,double width,double height){
        this.length=length;
        this.width=width;
        this.height=height;
    }

    void areaRectangle(){
        System.out.println(width*length);
    }
    void areaSquare(){
        System.out.println(Math.pow(side,2));
    }
    void areaBox(){
        System.out.println((2*length*width)+(2*length*height)+(2*width*height));
    }

}

class Main1{
    public static void main(String[] args) {
        HW3 obj = new HW3(10,10);
        obj.areaRectangle();

        HW3 obj2 = new HW3(10);
        obj2.areaSquare();

        HW3 obj3 = new HW3(10,10,10);
        obj3.areaBox();
    }
}
