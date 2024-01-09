package com.algorithms.sort;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {4,3,7,2,8,2,6,1};
        var sorter = new SelectionSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
