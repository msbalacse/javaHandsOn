package com.patterns;

public class Main {
    public static void main(String[] args) {
        // solving the striver pattern problem
        p8(5);
    }

    static void p1(){
        System.out.println("Pattern 1");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
    }
    
    static void p2(){
        System.out.println("Pattern 2");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
    }
    
    static void p3(){
        System.out.println("Pattern 3");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
    }

    static void p4(){
        System.out.println("Pattern 4");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
    }

    static void p5(){
        System.out.println("Pattern 5");
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
    }

    static void p6(){
        System.out.println("Pattern 6");
        for (int i = 5; i > 0; i--) {
            int count = 1;
            for (int j = i; j > 0; j--) {
                System.out.print(count++);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
    }

    static void p7(int n){
        System.out.println("Pattern 7");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
    }

    static void p8(int N){
        System.out.println("Pattern 8");
        for (int i = N; i > 0; i--) {
            for (int j =0; j<i; j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j< 2*N -(2*i +1);j++){

                System.out.print("*");
            }

            for (int j =0; j<i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();
    }
}
