package com.generic;

public class BoundedTypeParameter {
    public static void main(String[] args) {
        Double[] numbers = {1.0,2.0,3.8};
        System.out.println(countGreaterThan(numbers,0.9));
    }
    static <T extends Comparable<T>> int countGreaterThan(T[] numbers, T number){
        int count = 0;
        for (T n: numbers) {
            if(n.compareTo(number) > 0){
                count++;
            }
        }
        return count;
    }
}
