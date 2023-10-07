package com.ExceptionDemo;


class StackoverFlow extends Exception{
    public String toString(){
        return "Stack is overflow";
    }
}

class StackunderFlow extends Exception {
    public String toString(){
        return "Stack is overflow";
    }
}

class Stack {
    private int size;
    private int top=-1;
    private int S[];

    public Stack(int sz){
        size = sz;
        S = new int[size];
    }

    public void push(int x) throws StackoverFlow{
        if(top == size - 1)
            throw new StackoverFlow();
        top++;
        S[top] = x;
    }

    public int pop() throws StackunderFlow{
        int x = -1;
        if(top == -1)
            throw new StackunderFlow();
        x=S[top];
        top--;
        return x;
    }
}
public class Challenge {
    public static void main(String[] args) {
        Stack st = new Stack(3);

        try {
            st.push(4);
            st.push(3);
            st.push(8);
            st.push(8);
        }
        catch (StackoverFlow s){
            System.out.println(s);
        }
    }
}
