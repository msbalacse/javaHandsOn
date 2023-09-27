package com.collection;

import java.util.ArrayDeque;

public class DequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        // we can use array deque as stack and queue (fifo and lifo)

        dq.addFirst(10);
        dq.addFirst(20);
        dq.addFirst(30);
        dq.addFirst(40);

        dq.removeFirst();

        dq.forEach(x -> System.out.println(x));
    }
}
