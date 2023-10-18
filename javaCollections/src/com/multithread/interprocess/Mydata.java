package com.multithread.interprocess;

public class Mydata {
    int value = 0;
    boolean flag=true;

    synchronized public void setValue(int v){
        while (flag!=true)
            try{wait();}catch (Exception e){}
        value = v;
        flag =false;
        notify();
    }

    synchronized public int getValue(){
        int x = 0;
        while (flag!=false)
            try{wait();}catch (Exception e){}
        x = value;
        flag = true;
        notify();
        return x;
    }
}
