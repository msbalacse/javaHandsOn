package com.collection;

import java.util.LinkedHashSet;
import java.util.HashSet;
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // duplicates not allowed
        // Linked hashset will be print what first has initialized that will print first
        // but hashset is sort the elements
//        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        HashSet<String> lhs = new HashSet<>();

        lhs.add("A");
        lhs.add("B");
        lhs.add("I");
        lhs.add("F");
        lhs.add("B");

        lhs.forEach(System.out::println);
    }
}
