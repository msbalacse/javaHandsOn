package com.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();

        p.setProperty("Name","Balamurugan");
        p.setProperty("Qualification","BE CSE");
        p.setProperty("From","Madurai");

//        p.store(new FileOutputStream("/Users/HP/Desktop/java output/bala.txt"),"Personal information");
        p.load(new FileInputStream("/Users/HP/Desktop/java output/bala.txt"));
        System.out.println(p);
        System.out.println(p.getProperty("From"));
        p.setProperty("Likes","Royal enfield bike");
        p.store(new FileOutputStream("/Users/HP/Desktop/java output/bala.txt"),"Personal information");
    }
}
