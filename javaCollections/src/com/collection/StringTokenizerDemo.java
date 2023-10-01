package com.collection;

import java.io.FileInputStream;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("/Users/HP/Desktop/numbers.txt");

        byte[] b =new byte[fis.available()];

        fis.read(b);
        String data = new String(b);

        StringTokenizer stn = new StringTokenizer(data,",");
        String s;
        while (stn.hasMoreTokens()){
            s=stn.nextToken();
            System.out.println(s);
        }
    }
}
