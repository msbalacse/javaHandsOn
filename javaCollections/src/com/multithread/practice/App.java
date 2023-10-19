package com.multithread.practice;

public class App {
    public static void main(String[] args) {
        WhiteBoard wb = new WhiteBoard();
        Teacher t = new Teacher(wb);

        Student s1 = new Student("1. Bala",wb);
        Student s2 = new Student("2. Velmurugan",wb);
        Student s3 = new Student("3. Bharathi",wb);
        Student s4 = new Student("4. Joshua",wb);


        t.start();

        s1.start();
        s2.start();
        s3.start();
        s4.start();

    }
}
