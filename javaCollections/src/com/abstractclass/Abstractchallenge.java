package com.abstractclass;

abstract class Shape{
    abstract public void perimeter();
    abstract public void area();
}

class Circle extends Shape{
    private float radius;

    Circle(float radius){
        this.radius = radius;
    }

    @Override
    public void perimeter() {
        System.out.println("perimeter of circle : "+ 2*Math.PI*radius);
    }

    @Override
    public void area() {
        System.out.println("Area of circle : "+ Math.PI*(radius*radius));
    }
}

class Rectangle extends Shape{
    private float length;
    private float breath;

    Rectangle(float x, float y){
        this.length = x;
        this.breath = y;
    }

    @Override
    public void perimeter() {
        System.out.println("perimeter of rectangle : " + 2*(length+breath));
    }

    @Override
    public void area() {
        System.out.println("Area of rectangle : "+ length*breath);
    }
}
public class Abstractchallenge {
    public static void main(String[] args) {
        Shape shapeCircle = new Circle(5);
        Shape shapeReatangle = new Rectangle(10,15);

        shapeCircle.perimeter();
        shapeCircle.area();
        shapeReatangle.perimeter();
        shapeReatangle.area();
    }
}
