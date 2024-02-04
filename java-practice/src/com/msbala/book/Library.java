package com.msbala.book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void displayLibrary(){
        for (Book b:
             books) {
            System.out.println(b.title);
        }
    }

}
