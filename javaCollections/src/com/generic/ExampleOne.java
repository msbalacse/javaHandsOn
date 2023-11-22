package com.generic;

import java.util.ArrayList;
import java.util.List;
public class ExampleOne {
    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList();
//        numbers.add(1);
//        numbers.add(2);
//        for (Object number : numbers) {
//            System.out.println(number);
//        }
        exampleTwo();
    }

    public static void exampleTwo(){
        Comparable<Integer> number = 9;
        System.out.println(number.compareTo(10));
    }
}
