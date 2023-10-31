package com.GroceryApp;

import java.util.ArrayList;
import java.util.List;

class Product {
    private int id;
    private String name;
    private double price;
    private int quantityInStock;

    public Product(int id, String name, double price, int quantityInStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    // Implement getters and setters as needed.
}

class Customer {
    private int id;
    private String name;
    private String contactInfo;
    private List<Product> shoppingCart;

    public Customer(int id, String name, String contactInfo) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
        this.shoppingCart = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public List<Product> getShoppingCart() {
        return shoppingCart;
    }

    // Implement methods to add/remove products from the shopping cart.
}

class Store {
    private List<Product> products;
    private List<Customer> customers;

    public Store() {
        products = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Implement methods to allow customers to add/remove products from their cart.
    // Implement methods to calculate the total price of items in a customer's cart.
}

public class GroceryStoreApp {
    public static void main(String[] args) {
        Store groceryStore = new Store();

        // Add products to the store's inventory.
        Product apple = new Product(1, "Apple", 0.5, 100);
        Product banana = new Product(2, "Banana", 0.3, 150);
        groceryStore.addProduct(apple);
        groceryStore.addProduct(banana);

        // Add customers to the store.
        Customer customer1 = new Customer(1, "Alice", "alice@example.com");
        Customer customer2 = new Customer(2, "Bob", "bob@example.com");
        groceryStore.addCustomer(customer1);
        groceryStore.addCustomer(customer2);

        // Add products to customers' shopping carts and process purchases.

        System.out.println(customer1.getShoppingCart());
        System.out.println(customer1.getContactInfo());
        // Implement the rest of the interactions as needed.

    }
}
