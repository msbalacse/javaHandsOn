package com.javaioexercise;

import java.io.*;

class MyRead {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("D://JavaFiles//dop.txt");
        DataInputStream dis = new DataInputStream(fis);

        Student s2 = new Student();

        s2.rollNo = dis.readInt();
        s2.name = dis.readUTF();
        s2.dept = dis.readUTF();
        System.out.println(s2.rollNo);
        System.out.println(s2.name);
        System.out.println(s2.dept);
    }
}
class Writer {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("D://JavaFiles//dop.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        Student s1 = new Student();
        s1.rollNo = 10;
        s1.name = "Example";
        s1.dept = "Civil";

        dos.writeInt(s1.rollNo);
        dos.writeUTF(s1.name);
        dos.writeUTF(s1.dept);

    }
}
public class SerialisationDataInputAndOutputStream {
    public static void main(String[] args) {
        System.out.println("Serialisation Data Input And Output Stream");
    }
}
