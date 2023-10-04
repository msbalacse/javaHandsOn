package com.ExceptionDemo;

public class NestedExceptionCatch {
    public static void main(String[] args) {
        int A[] = {230,523,64,0,35};
        try{
            int c=A[0]/A[2];
            System.out.println("Division is "+ c);
            try {
                System.out.println(A[8]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Index is Invalid");
            }
        }catch (ArithmeticException e){
            System.out.println("Denominator should not be 0");
        }
        System.out.println("Program end");
    }
}
