package com.javaioexercise;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutput {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);

        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');

        bos.writeTo(new FileOutputStream("C://Users//HP//Desktop//FileOutputStream__forByteArray.txt"));

        byte b[] = bos.toByteArray();

        for(byte x:b){
            System.out.println((char)x);
        }

        bos.close();
    }
}
