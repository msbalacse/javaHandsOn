package com.conversion;

import java.util.Scanner;

public class Binary_Decimal {
    static  Scanner read = new Scanner(System.in);
    static int num;
    static void getBinaryVal(){
        System.out.println("Enter the binary number which you want to change in decimal value : ");
        num = Integer.parseInt(read.nextLine(),2);
    }

    static void decimalValue(){
        String convertedValue = Integer.toString(num);
        System.out.println("The Converted Decimal Value : " + convertedValue);
    }
    public static void main(String[] args) {
        getBinaryVal();
        decimalValue();
    }
}
