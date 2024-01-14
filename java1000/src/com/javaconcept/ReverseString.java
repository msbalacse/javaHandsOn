package com.javaconcept;

public class ReverseString {


    static void iterativeMethod(){
        System.out.println("By Using Iterative Method");
        String str = "iterativeMethod";
        char[] strArray = str.toCharArray();
        for (int i = strArray.length; i > 0 ; i--) {
            System.out.print(strArray[i - 1]);
        }
        System.out.println();
    }

    static String recursiveMethod(String str){
        if((str == null)||(str.length() <= 1)){
            return str;
        }
        return recursiveMethod(str.substring(1))+str.charAt(0);
    }

    public static void main(String[] args) {

        //recursiveMethod
        System.out.println(recursiveMethod("recursive"));

        // Iterative Method
        iterativeMethod();


        // StringBuffer Method
        StringBuffer str = new StringBuffer("Hello Java");

        System.out.println(str.reverse());
    }
}
