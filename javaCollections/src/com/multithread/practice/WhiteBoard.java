package com.multithread.practice;

public class WhiteBoard {
    String text;
    int noOfStudents = 0;
    int count = 0;
    public void attendance(){
        noOfStudents++;
    }

    synchronized public void write(String t){
        System.out.println("Teacher is writing "+ t);
        while (count != 0)
            try{wait();}catch (Exception e){}
        text = t;
        count = noOfStudents;
        notifyAll();
    }

    synchronized  public String read(){
        while (count==0)
            try{wait();}catch (Exception e){}
        String t = text;
        count--;
        if(count==0)
            notify();
        return t;
    }

}
