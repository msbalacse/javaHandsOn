package com.javaio;

import java.io.FileInputStream;

public class FileReading {
    public static void main(String[] args) throws Exception {
        try (FileInputStream fis = new FileInputStream("D:\\Test.txt")){
            byte b[] = new byte[fis.available()];
            fis.read(b);

            String str = new String(b);
            System.out.println(str);
        }
    }
}
