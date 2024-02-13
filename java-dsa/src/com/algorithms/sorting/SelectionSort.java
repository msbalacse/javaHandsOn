package com.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {


    public static void sort(int[] arr){
        int n = arr.length;

        for(int i=0; i<= n-2; i++){
            int mini = i;
            for (int j = i; j <= n-1 ; j++) {
                if(arr[j]<arr[mini]) mini = j;
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {2,8,3,4,8,1,9,3,5};
        sort(arr);
    }
}
