package com.javaioexercise;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StudentChallenge {
    public static void main(String[] args) throws Exception {

            float list[] = {1.2f,3.4f,7.2f,2.4f};

            FileOutputStream fos = new FileOutputStream("D://JavaFiles//List.txt");

        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(list.length);

        for(float f:list){
            dos.writeFloat(f);
        }
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("D://JavaFiles//List.txt");
        DataInputStream dis = new DataInputStream(fis);

        int length = dis.readInt();
        float data;
        for (int i = 0; i < length; i++) {
            data = dis.readFloat();
            System.out.println(data);
        }

        fis.close();
        dis.close();

    }
}
