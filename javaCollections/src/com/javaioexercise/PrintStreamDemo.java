package com.javaioexercise;

import java.io.*;

class Student {
    int rollNo;
    String name;
    String dept;
}
public class PrintStreamDemo {
    public static void main(String[] args) throws Exception {

        // file writer
        FileOutputStream fos = new FileOutputStream("D://javaFiles//Student1.txt");
        PrintStream ps = new PrintStream(fos);

        Student s = new Student();
        s.rollNo = 10;
        s.name = "Joshua";
        s.dept = "CSE";

        ps.println(s.rollNo);
        ps.println(s.name);
        ps.println(s.dept);

        ps.close();
        fos.close();

        //file reader

        FileInputStream fis = new FileInputStream("D://javaFiles//Student1.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        Student s1 = new Student();
        s1.rollNo = Integer.parseInt(br.readLine());
        s1.name = br.readLine();
        s1.dept = br.readLine();

        System.out.println("Roll no :" + s1.rollNo);
        System.out.println("Name :" + s1.name);
        System.out.println("Department :" + s1.dept);
    }
}
