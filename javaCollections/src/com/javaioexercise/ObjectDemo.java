package com.javaioexercise;
import java.io.*;

class  Student1 implements Serializable{
    private int rollNo;
    private String name;
    private float avg;
    private  String dept;
    public static int data = 10;
    public transient int t;

    public Student1(){

    }

    public Student1(int r,String n,float a,String d){
        rollNo=r;
        name = n;
        avg = a;
        dept = d;

        data = 500;
        t = 500;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", avg=" + avg +
                ", dept='" + dept + '\'' +
                ", Data='" + data + '\'' +
                ", t=" + t +
                '}';
    }
}
public class ObjectDemo {
// object output stream
//    public static void main(String[] args) throws Exception {
//        FileOutputStream fos =new FileOutputStream("D://JavaFiles//StudentObject.txt");
//        ObjectOutputStream obs = new ObjectOutputStream(fos);
//
//        Student1 s = new Student1(10,"Joshua",34.3f,"CSE");
//
//        obs.writeObject(s);
//
//        fos.close();
//        obs.close();
//    }

    public static void main(String[] args) throws Exception {
        FileInputStream fis =new FileInputStream("D://JavaFiles//StudentObject.txt");
        ObjectInputStream obis = new ObjectInputStream(fis);

        Student1 s = (Student1) obis.readObject();

        System.out.println(s);

        fis.close();
        obis.close();
    }
}
