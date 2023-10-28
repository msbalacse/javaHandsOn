package com.javaioexercise;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferDemo {
    public static void main(String[] args)throws Exception {

        FileOutputStream fos = new FileOutputStream("D://JavaFiles//Sample.txt");
        String str= "Helloprogrammingworld";

        byte b[] = str.getBytes();

        fos.write(b);
        fos.close();

        FileInputStream fis = new FileInputStream("D://JavaFiles//Sample.txt");
        BufferedInputStream bis =  new BufferedInputStream(fis);

        System.out.println("start");
        System.out.println();
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.println();
        bis.mark(3);
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());

        bis.reset();

        System.out.println();
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());

        bis.reset();

        System.out.println();
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());

        bis.reset();

        System.out.println();
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());

        System.out.println();
        System.out.println("new mark is setting");
        bis.mark(12);
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.reset();
        System.out.println();
        System.out.println("new mark is setting");
        bis.mark(10);
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());

        bis.reset();

        System.out.println();

        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());

        bis.reset();

        System.out.println();

        System.out.print((char) bis.read());
        System.out.print((char) bis.read());

        System.out.println();
        System.out.println("end");
    }
}
