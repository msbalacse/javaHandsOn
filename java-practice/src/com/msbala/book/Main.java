package com.msbala.book;

public class Main {
    public static void main(String[] args) {
        System.out.println("Book Library");

        Book java = new Book("DSA with Java","Sun micro",2011);
        Book python = new Book("Python for Everyone","snake",1996);

        System.out.println("----------   Library   -----------");

        Library Lib = new Library();
        Lib.addBook(java);
        Lib.addBook(python);
        Lib.addBook(java);

        Lib.displayLibrary();

        System.out.println("----------   List   -----------");

        java.displayInfo();
        python.displayInfo();

    }
}
