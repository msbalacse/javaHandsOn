package com.ExceptionDemo;

class NegativeDimensionException extends Exception{
    public String toString(){
        return "Negative dimension exception. you can not generate dimension using negative values";
    }
}

public class ThrowThrows {
    public static void main(String[] args){
        try {
            math1();
        }
        catch (NegativeDimensionException e){
            System.out.println(e);
        }
    }
    static void math1() throws NegativeDimensionException{
        System.out.println(area(-10,4));
    }
    static int area(int l, int b) throws NegativeDimensionException {
        if(l<0 || b<0)
            throw new NegativeDimensionException();
        return l*b;
    }
}
