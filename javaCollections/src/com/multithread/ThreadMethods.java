package com.multithread;


class MyThreads extends Thread{
    public MyThreads(String name){
        super(name);
    }

    public void run(){
        int count = 0;

        while (true){
            System.out.println(count++);
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
        System.out.println("Thread methods constructor");

        MyThreads t = new MyThreads("My thread one");

        t.setPriority(MyThread.MAX_PRIORITY);

        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        t.start();
        t.interrupt();
        System.out.println(t.getState());
        System.out.println(t.isAlive());
    }
}
