package com.msbala.book;

public class Book {
    String title;
    String author;
    int year;


    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }


    public void displayInfo(){
        System.out.println("Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}');
        System.out.println("--------------------------------");
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
