package com.algorithms.sort;

import java.util.Arrays;

import static com.algorithms.sort.BubbleSort.swap;

public class SelectionSort {

    public void sort(int[] array){
        for(int i=0; i<array.length; i++){
            var minIndex = i;
            for(int j= i; j<array.length; j++){
                if(array[i] < array[minIndex])
                    minIndex = j;
            }
            swap(array, minIndex, i);
        }
        System.out.println(Arrays.toString(array));
    }

}
