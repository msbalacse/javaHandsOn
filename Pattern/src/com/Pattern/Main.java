package com.Pattern;


public class Main {
    public static void main(String[] args) {
        System.out.println();
        pattern3(4);
    }

//    Output of Pattern 1 Answer
//    n = 4
//    *
//    * *
//    * * *
//    * * * *

    static void pattern1(int n){
        System.out.println("---------  Pattern 1  ---------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


//    Output of Pattern 2 Answer
//    n = 4
//    * * * *
//    * * *
//    * *
//    *
    static void pattern2(int n){
        for(int i = 1; i <= n; i++ ){
            for(int j = 1; j <= n - i + 1; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//     Output of Pattern 3 Answer
//     n = 4
//     *
//     * *
//     * * *
//     * * * *
//     * * *
//     * *
//     *

    static void pattern3(int n){
        for (int i = 0; i <= 2 * n; i++) {
            int totalSpace = i > n ? 2 * n - i : i;
            for (int j = 0; j < totalSpace; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
