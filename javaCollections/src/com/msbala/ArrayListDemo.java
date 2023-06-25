package com.msbala;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        // create an arraylist
        ArrayList<String> al = new ArrayList<>();


        // adding elements in arraylist

        al.add("Audi");
        al.add("Benz");
        al.add("Volvo");
        al.add("Ferrari");

        // display the arraylist
        System.out.println("Contents of ArrayList after add : " + al);

        // remove 2nd index element from arraylist
        al.remove(2);

        // after remove element display the arraylist
        System.out.println("Contents of ArrayList after add : " + al);

    }
}
