package com.collection;

import java.util.Arrays;
import java.util.Comparator;

class My implements Comparator<Integer>{
    public int compare(Integer i1,Integer i2){
        if(i1 < i2)
            return -1;
        else if(i1 > i2)
            return 1;
        else
            return 0;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        Integer a[] = {2,6,3,8,1,7,9};

        Arrays.sort(a,new My());

        for(Integer x:a)
            System.out.println(x);
    }
}
