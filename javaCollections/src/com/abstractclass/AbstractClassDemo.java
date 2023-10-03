package com.abstractclass;


abstract class Super {
    Super(){
        System.out.println("Super class Constructor");
    }
    public void math1(){
        System.out.println("Method 1 of super class");
    }
    abstract public void math2();
}

class Sub extends Super{
    @Override
    public void math2(){
        System.out.println("Method 2 abstract method");
    }
}
public class AbstractClassDemo {
    public static void main(String[] args) {
//      Super sup = new Super(); i can not create object for abstract class
        Super sub = new Sub();
        sub.math1();
        sub.math2();
    }
}
