package com.generic;

public class GenericAndMethods {
    public static void main(String[] args) {

        String[] names = {"joshua","max"};

        Character[] letters = {'A','B','C'};

        Integer[] numbers = {1,2,3};

        print(names);
        print(letters);
        print(numbers);

    }
    static <T> void print(T[] array){
        for (T e: array){
            System.out.println(
                    e.getClass().getName() + " - "+ e
            );
        }
    }
}
