package com.oop;

public class App {
    public static void main(String[] args) {
        System.out.println("Oops project");
        Product dairy = new Product("a01","Chocolate Bar",2.2200007, 10);

        dairy.productDetails();
        dairy.setItemName("Milkey bar");
        dairy.productDetails();
    }
}
