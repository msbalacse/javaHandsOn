package com.lambda;


// if interface have only one method is act as functional interface
@FunctionalInterface
interface Mylambda {
    public void display();
}

// outer class method
//class My implements Mylambda {
//    public void display(){
//        System.out.println("Hello world");
//    }
//}

public class FunctionInterfaceLambda {
    public static void main(String[] args) {
        // second method
//        Mylambda ml = new Mylambda() {
//            @Override
//            public void display() {
//
//            }
//        };

        // third anonymous lambda function

        Mylambda ml = ()-> {
            System.out.println("Hello world!!");
        };

        ml.display();
    }
}
