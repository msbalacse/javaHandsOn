package com.library;

public class App {
    public static void main(String[] args) {
        System.out.println("Library App");

        Book book = new Book("Sample Book", "John Doe", 200);

        // Create a user
        User user = new User("Alice", 30);

        // Demonstrate inheritance and encapsulation
        user.checkOutItem(book);

        // Demonstrate polymorphism
        user.displayInfo();
        user.displayCheckedOutItems();
    }
}
