package com.gfg;

import java.util.Scanner;

public class ReverseString {

    public static String reverseString(String name){
        int lenStr = name.length();
        StringBuilder newStr = new StringBuilder();
        for (int i=lenStr - 1; i>=0; i--){
            newStr.append(name.charAt(i));
        }
        return newStr.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = in.nextLine();

//        System.out.println("The reverse string is "+ reverseString(name));
        System.out.println(reverseString(name));
    }
}
