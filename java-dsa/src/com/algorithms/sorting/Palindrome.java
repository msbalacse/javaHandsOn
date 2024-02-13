package com.algorithms.sorting;

public class Palindrome {

    public static boolean isPalindrome(String str){
        int i = 0;
        int end = str.length() - 1;
        while (i < end){
            if(str.charAt(i) != str.charAt(end)){
                return false;
            }
            i++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("saravanabhavaavahbanavaras"));
    }
}
