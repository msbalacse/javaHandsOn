package com.javaioexercise;

import java.io.RandomAccessFile;

public class RandomAccessDemo {
    public static void main(String[] args) throws Exception {
        RandomAccessFile rf = new RandomAccessFile("D://JavaFiles/Data.txt","rw");

        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        rf.write('d');
        System.out.println((char)rf.read());
        rf.skipBytes(3);
        System.out.println((char)rf.read());
        // change the pointer position, only can already know bytes
        rf.seek(3);
        System.out.println((char)rf.read());


        System.out.println(rf.getFilePointer());
        rf.seek(rf.getFilePointer() + 2);
        System.out.println(rf.getFilePointer());

    }
}
