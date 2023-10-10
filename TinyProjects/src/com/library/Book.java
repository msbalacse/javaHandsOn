package com.library;

public class Book extends LibraryItem{
    private int pageCount;
    public  Book(String title,String author,int pageCount){
        super(title,author);
        this.pageCount = pageCount;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Page Count: " + pageCount);
    }

}
