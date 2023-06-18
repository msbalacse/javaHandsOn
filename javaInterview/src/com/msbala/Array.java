package com.msbala;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("Array");
        System.out.println("------------------");
        System.out.println();
        twoDArray();
    }
    public static void twoDArray(){
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                    arr[i][j] = in.nextInt();
            }
            System.out.println();
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }
}
