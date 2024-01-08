package com.algorithms.sort;

import java.util.Arrays;

public class BubbleSort {

    public static String BubleSorting(int[] arr){
        int lenarr = arr.length;
        int[] copyArr = arr;
        for(int i=0; i<lenarr; i++){
            for(int j=1; j<lenarr; j++){
                if(copyArr[j] > copyArr[j-1]){
                    int temp = copyArr[j];
                    copyArr[j] = copyArr[j-1];
                    copyArr[j-1] = temp;
                }
            }
        }

        return Arrays.toString(copyArr);
    }
    public static void main(String[] args) {
        int[] arr = {8,1,5,6,3};
        System.out.println("It's sort in reverse order : ");
        System.out.println(BubleSorting(arr));
    }
}
