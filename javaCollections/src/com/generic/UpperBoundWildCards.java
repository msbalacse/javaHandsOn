package com.generic;

import java.util.Arrays;
import java.util.List;

public class UpperBoundWildCards {
    public static void main(String[] args) {
        // ? wildcard
        // Upper bound wildcards

        List<Object> list1 = Arrays.asList(1,2);
        List<Integer> list2 = Arrays.asList(1,2);
        List<String> list3 = Arrays.asList("1","2");


        print(list1);
        print(list2);
        print(list3);

    }

    static void print(List<?> list){
        list.forEach(e-> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }
}
