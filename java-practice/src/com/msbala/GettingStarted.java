package com.msbala;

public class GettingStarted {
    public static void main(String[] args) {
        System.out.println("Java program has run successfully. ✨");
        compareTwoNumber(5,6);
    }

    public static void compareTwoNumber(int a,int b){
         /*
            Write a program that compares two numbers. Use any comparison operator
            Create 2 variables.
        */
        if(a > b){
            System.out.println(a+" greater then "+b);
        }else if(a < b){
            System.out.println(b+" greater then  "+a );
        }else {
            System.out.println(a+" both are equals  "+b);
        }
    }
}
