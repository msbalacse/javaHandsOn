package com.library;

import java.util.*;

public class User extends Person{
    private List<LibraryItem> checkedOutItems;

    public User(String name, int age) {
        super(name, age);
        checkedOutItems = new ArrayList<>();
    }

    public void checkOutItem(LibraryItem item) {
        checkedOutItems.add(item);
    }

    public void displayCheckedOutItems() {
        System.out.println("Checked Out Items:");
        for (LibraryItem item : checkedOutItems) {
            item.displayInfo();
        }
    }
}
