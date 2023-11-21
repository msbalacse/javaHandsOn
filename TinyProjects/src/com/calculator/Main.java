package com.calculator;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        AreaCalculator areaCalculator = new AreaCalculator();
        Rectangle rectangle = new Rectangle(10,5);
        Circle circle = new Circle(5);

        Square square = new Square();

        List<Shape> shapes = List.of(rectangle,circle,square);

        int sum = areaCalculator.sum(shapes);
        System.out.println(sum);


    }
}
