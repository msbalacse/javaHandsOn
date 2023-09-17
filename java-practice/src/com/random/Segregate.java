package com.random;

public class Segregate {
    public static void main(String[] args)
    {
        int[] array = { 0, 1, 0, 1, 1, 0 };
        segregate0and1(array, 6);
        for(int i = 0 ; i < 6; i++)
        {
            System.out.print(array[i]+"\t");
        }
    }

    static void segregate0and1(int[]array, int size){
        int left = 0, right = size - 1;

        while (left < right){
            while (array[left] == 0 && left < right)
                left++;
            while (array[right] == 1 && left < right)
                right--;
            if(left < right){
                array[left] = 0;
                array[right] = 1;
                left++;
                right--;
            }
        }
    }
}
