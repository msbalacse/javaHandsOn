package com.multithread;

class Mydata{
//    public void display(String str){
//    synchronized (this){
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
//            }
//        }
//    }
    synchronized public void display(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            try{Thread.sleep(100);}catch (Exception e){
                System.out.print(e);
            }
        }
        System.out.println("");
    }
}

class MythradSync1 extends Thread{
    Mydata d;
    public  MythradSync1(Mydata d){
        this.d = d;
    }

    public void run(){
        d.display("Hello world");
    }
}

class MythradSync2 extends Thread{
    Mydata d;
    public  MythradSync2(Mydata d){
        this.d = d;
    }

    public void run(){
        d.display("welcome all");
    }
}

public class Syncdemo {
    public static void main(String[] args) {
        Mydata data =new Mydata();

        MythradSync1 t1= new MythradSync1(data);
        MythradSync2 t2= new MythradSync2(data);

        t1.start();
        t2.start();
    }
}
