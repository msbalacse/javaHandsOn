package com.oop;

public class Product {

    // declare the methods
    private String itemNo;
    private String itemName;

    private double price;
    private int quantity;

    // properties methods

    // get methods
    public String getItemNo() {
        return itemNo;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // set methods


    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // constructor

    public Product(String itemNo, String itemName, double price, int quantity) {
        this.itemNo = itemNo;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }


    // class methods

    public void productDetails() {
        System.out.println(itemName + ", "+ itemNo);
    }
}
