package com.multithread;

class ThreadTestRun implements Runnable{
    public void run(){
        int i = 1;
        while (true){
            System.out.println(i+" Hello");
            i++;
        }
    }
}
public class RunnableTest {
    public static void main(String[] args) {
        ThreadTestRun tt =new ThreadTestRun();

        Thread t = new Thread(tt);
        t.start();

        int i = 1;
        while (true){
            System.out.println(i+" World");
            i++;
        }

    }
}
