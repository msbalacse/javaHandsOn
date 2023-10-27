package com.javaioexercise;

import java.io.ByteArrayInputStream;

public class ByteArrayInput {
    public static void main(String[] args) throws Exception {
        byte b[] = {'a','b','c','d','e','f','g','h','i','j'};

        ByteArrayInputStream bis = new ByteArrayInputStream(b);

//        Method 1
//        int x;
//        while ((x = bis.read())!=-1){
//            System.out.println((char)x);
//        }

        String str =new String(bis.readAllBytes());

        System.out.println(str);
        // It supports mark a element in the array. how? it is an array
        // we can traverse again if we want, so we can use markSupported property
        System.out.println(bis.markSupported());

        bis.close();
    }
}
