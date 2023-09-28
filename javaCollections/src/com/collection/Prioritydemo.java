package com.collection;

import java.util.Comparator;
import java.util.PriorityQueue;

class Mycom implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2){
        if(o1<o2) return 1;
        if(o1>o2) return -1;
        return 0;
    }
}

// note
//it is binary search tree and default store the data top to down way smallest value is highest priority and largest value
//has lowest priority. Tree will be like smallest value top of the tree and highest value end of the tree
public class Prioritydemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>(new Mycom());

        p.add(20);
        p.add(10);
        p.add(30);
        p.add(5);
        p.add(15);
        p.add(3);

        System.out.println(p.peek());
        p.forEach(x-> System.out.println(x));

        p.poll();
        System.out.println("After deletion");
        p.forEach(x-> System.out.println(x));

    }
}
