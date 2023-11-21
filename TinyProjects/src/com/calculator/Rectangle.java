package com.calculator;

public class Rectangle implements Shape {
    private final int width;
    private final int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }
}
