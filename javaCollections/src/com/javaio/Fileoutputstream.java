package com.javaio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileoutputstream {
    public static void main(String[] args) {
        try{
              FileOutputStream fos = new FileOutputStream("D:\\Test.txt");
              String str = "learn java programming";

                // convert string to byte of an array
                //              byte b[] = str.getBytes();
                //
                //              for(byte x:b) {
                //              fos.write(x);
                //              }
                //              }

            byte b[] = str.getBytes();

            fos.write(b,6,str.length()-6);

              fos.close();
        }catch (FileNotFoundException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
