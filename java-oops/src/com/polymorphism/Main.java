package com.polymorphism;

public class Main {

    // method overloading

    static int addnums(int a,int b){
        return a+b;
    }

    static int addnums(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println("Polymorphism");
        System.out.println(addnums(12,32));
        System.out.println(addnums(5,5,5));
    }
}
