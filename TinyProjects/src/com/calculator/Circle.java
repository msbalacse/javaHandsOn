package com.calculator;

public class Circle implements Shape {

    private final double RADIUS;

    public Circle(double radius) {
        RADIUS = radius;
    }

    @Override
    public double area() {
        return Math.PI * RADIUS * RADIUS;
    }
}
