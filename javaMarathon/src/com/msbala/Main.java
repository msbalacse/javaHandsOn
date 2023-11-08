package com.msbala;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java ✨");
        System.out.println(22+18);

        String example = "W1o2r3d";

        char[] covertChar = example.toCharArray();

        System.out.println(Arrays.toString(covertChar));

        for(char c:covertChar){
            System.out.println(c);
        }

        System.out.println();
        System.out.println();
        System.out.println();

        int i =0;
        while(i < 51){
            System.out.println(i++);
        }
    }
}