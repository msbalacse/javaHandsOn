package com.algorithms.sort;

import java.util.Arrays;

public class BubbleSort {

    public static String BubleSorting(int[] arr){
        boolean isSorted;

        for(int i=0; i<arr.length; i++){
            isSorted = true;
            for(int j=1; j<arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                    isSorted = false;
                }
            }
            if(isSorted)
                break;
        }

        return Arrays.toString(arr);
    }

    protected static void swap(int[] arr, int index1, int index2){
        var temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {8,1,5,6,3};
        System.out.println("It's sort in reverse order : ");
        System.out.println(BubleSorting(arr));
    }
}
