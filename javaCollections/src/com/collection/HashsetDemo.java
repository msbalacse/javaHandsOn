package com.collection;

import java.util.HashSet;

public class HashsetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs =  new HashSet<>(20,0.5f);

        //default minimum loading factor is 75% of storage could use the hashtable. we can customize the loading factor
        // 0 - 1 scale

        hs.add(20);
        hs.add(10);
        hs.add(30);
        hs.add(10);

        System.out.println(hs);
    }
}
