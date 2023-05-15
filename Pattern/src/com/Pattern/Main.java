package com.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        pattern(4);
    }
    static void pattern(int n){
        System.out.println("---------  Pattern 1  ---------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
