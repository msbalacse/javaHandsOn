package com.multithread.interprocess;


class Producer extends Thread {
    Mydata d;
    public Producer(Mydata data){
        d = data;
    }

    public void run(){
        int count = 1;
        while(true){
            d.setValue(count);
            System.out.println(" Producer value " + count);
            count++;
        }
    }

}
class Consumer extends Thread {
    Mydata d;
    public Consumer(Mydata data){
        d = data;
    }

    public void run(){
        int value;
        while(true){
            value = d.getValue();
            System.out.println("Consumer : "+value);
        }
    }

}
public class InterProcess {
    public static void main(String[] args) {
        Mydata data = new Mydata();

        Producer p =new Producer(data);
        Consumer c =new Consumer(data);

        p.start();
        c.start();
    }
}
