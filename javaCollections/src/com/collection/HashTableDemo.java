package com.collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
//        Hashtable ht = new Hashtable();
//
//        ht.put(1,"w");
//        ht.put(2,"m");
//        ht.put(3,"f");
//        ht.put(4,"t");
//
//        Enumeration et = ht.elements();
//
//        while (et.hasMoreElements()){
//            System.out.println(et.nextElement());
//        }
//
//        String s= (String) ht.get(2);
//        System.out.println(s);


        // here i notice a thing. it print the elements what way we have inserted (lifo)

        Hashtable<Integer,String> ht = new Hashtable<>();

        ht.put(1,"w");
        ht.put(2,"m");
        ht.put(3,"f");
        ht.put(4,"t");

        ht.compute(3,(k,v)-> "The compute value is " + v);
        ht.computeIfAbsent(10,(k)->"the absent value "+ k);

        System.out.println(ht);

    }
}
