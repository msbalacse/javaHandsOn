package com.msbala.exceptions;

public class Main {
    public static void main(String[] args) {
        System.out.println("java 🌟");

        //Exceptions
        try{
            System.out.println(divide(10,0));
        }catch (MyCheckedException e){
            System.out.println(e.getMessage());
        }
    }

    public static int divide(int a, int b) throws MyCheckedException{
        if(b==0){
            throw new MyCheckedException("Cannot divide by 0");
        }
        return a/ b;
    }
}
