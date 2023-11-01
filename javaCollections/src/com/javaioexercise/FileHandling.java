package com.javaioexercise;

import java.io.File;

public class FileHandling {
    public static void main(String[] args) throws Exception {
        File f=new File("D://");

        System.out.println(f.isDirectory());

        String listFile[] = f.list();

        for (String x:listFile){
            System.out.println(x);
        }

        System.out.println("---------------------------------");

        File list[] = f.listFiles();

        for(File x:list){
            System.out.print(x.getName()+" ");
            System.out.println(x.getPath());
        }

    }
}
