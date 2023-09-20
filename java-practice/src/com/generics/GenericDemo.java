package com.generics;

public class GenericDemo<T> {
    // Class Data
    private T obj;

    public void setDate(T v){
        obj=v;
    }

    public T getObj() {
        return obj;
    }

    // Class Array

    static class MyArray<T>{
        T A[] =(T[]) new Object[10];
        int length = 0;
        public void append(T v){
            A[length++] = v;
        }
        public void display(){
            for (int i = 0; i < 3; i++) {
                System.out.println(A[i]);
            }
        }

    }
    public static void main(String[] args) {
        GenericDemo<String> sobj = new GenericDemo<>();

        sobj.setDate("Bala");
        System.out.println(sobj.getObj());

        MyArray<String> myintArray = new MyArray<>();

        myintArray.append("hello");
        myintArray.append("world");
        myintArray.display();

    }
}
