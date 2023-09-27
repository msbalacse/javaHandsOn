package com.collection;

import java.util.LinkedList;

public class ListPractice {
    public static void main(String[] args) {
        LinkedList<Integer> al = new LinkedList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        al.remove();
        al.pollLast();
        al.forEach(x-> System.out.println(x));
    }
}
