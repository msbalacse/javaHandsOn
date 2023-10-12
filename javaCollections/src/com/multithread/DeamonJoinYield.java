package com.multithread;

public class DeamonJoinYield {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setDaemon(true);
        mt.start();
        Thread mainThread = Thread.currentThread();
//        try{
//            mainThread.join();
//        }catch (InterruptedException e){
//            System.out.println(e);
//        }
        int count=0;
        while (true){
            System.out.println(count++ + "Main");
            Thread.yield();
        }
    }
}
