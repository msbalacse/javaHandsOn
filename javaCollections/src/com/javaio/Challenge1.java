package com.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class Challenge1 {
    public static void main(String[] args) {
        String textLower = "";
        try {
            FileInputStream fis = new FileInputStream("E:\\Testfiles\\source1.txt");
            FileInputStream fis1 = new FileInputStream("E:\\Testfiles\\source2.txt");

            byte b[] = new byte[fis.available()];

            fis.read(b);

            String text = new String(b);
            System.out.println(text);

            textLower = text.toLowerCase();

            FileOutputStream fos = new FileOutputStream("E:\\Testfiles\\source2.txt");
            FileOutputStream combineOutput = new FileOutputStream("E:\\Testfiles\\combine.txt");

            byte fosbyte[] = textLower.getBytes();

            fos.write(fosbyte);
            SequenceInputStream combinefile = new SequenceInputStream(fis,fis1);

            int cb;
            while ((cb=combinefile.read())!=-1){
                combineOutput.write(cb);
            }

            fos.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
