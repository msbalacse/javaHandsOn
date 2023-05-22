package com.msbala;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java Interview problems");
    }

//    Reverse Array using method
//    int[] arr = {67,32,49,89,24};
//    System.out.println("Original Array " + Arrays.toString(arr));
//    System.out.println("Reversed Array "+reverseArr(arr));
    static String reverseArr(int[] n){
        int[] temp = new int[5];
        for (int i = 0; i < n.length; i++) {
            temp[i] = n[n.length - 1 -i];
        }
        return Arrays.toString(temp);
    }
}
