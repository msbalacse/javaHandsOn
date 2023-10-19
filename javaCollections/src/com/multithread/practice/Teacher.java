package com.multithread.practice;

public class Teacher extends Thread{
    WhiteBoard wb;

    String notes[] = {"Java is my favorite programming language","Focus does matter","How to solve a problem","Programming language","end"};

    public Teacher(WhiteBoard w){
        wb = w;
    }

    public void run(){
        for (int i = 0; i < notes.length; i++) {
            wb.write(notes[i]);
        }
    }
}
