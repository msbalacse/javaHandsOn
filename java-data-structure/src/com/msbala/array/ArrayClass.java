package com.msbala.array;


import java.util.ArrayList;

public class ArrayClass {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.remove(0); // remove by index

        if(numbers.contains(20)){
            System.out.println(20 + " is there"); // check the contain value
        }

        System.out.println(numbers.hashCode()); // Array hashcode

        System.out.println(numbers.size()); // Array Size

        System.out.println(numbers.toString());

        System.out.println(numbers.set(0,10)); // set the value particular index

        System.out.println(numbers.removeIf(i -> i < 18));



        numbers.forEach(n -> System.out.println(n));


        System.out.println(numbers.toString());
    }
}
