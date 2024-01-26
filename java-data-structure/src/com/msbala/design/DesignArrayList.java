package com.msbala.design;

import java.util.Arrays;

public class DesignArrayList {

    // Define INITIAL_CAPACITY, size of elements of custom ArrayList

    private static final int INITIAL_CAPACITY = 10;
    private int size = 0;
    private Object elementData[] = {};

    /**
     * Constructor
     *
     */

    DesignArrayList(){
        elementData = new Object[INITIAL_CAPACITY];
    }

    /**
     * Add elements in custom/your own ArrayList
     * Method adds elements in ArrayListCustom.
     *
     */

    public void add(Integer e){
        if(size == elementData.length){
            ensureCapacity();
        }
        elementData[size++] = e;
    }

    private void ensureCapacity() {
        int newIncreasedCapacity = elementData.length * 2;
        elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
    }
    public static void main(String[] args) {

    }
}
