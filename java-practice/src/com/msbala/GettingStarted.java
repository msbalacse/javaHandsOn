package com.msbala;

public class GettingStarted {
    public static void main(String[] args) {
        System.out.println("Java program has run successfully. ✨");
        compareTwoNumber(5,6);
        toUpperCase("hello");

        String name1 = "bala";
        String name2 = "joshua";

        if(name1.equals(name2)){
            System.out.println("both are equal");
        }else{
            System.out.println("The two string are not same");
        }
    }

    public static void toUpperCase(String str){
        // Write a program that transform "amigoscode" to "Amigoscode"
        System.out.println(str.toUpperCase());
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
