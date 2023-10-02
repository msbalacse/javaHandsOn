package com.lambda;

@FunctionalInterface
interface MylambdaPara {
    public int add(int x,int y);
}
public class ParameterLambda {
    public static void main(String[] args) {

        MylambdaPara mlp = (a,b)-> {return a+b;};

        int result = mlp.add(14,3);

        System.out.println(result);

    }
}
