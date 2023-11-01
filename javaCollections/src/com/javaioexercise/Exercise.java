package com.javaioexercise;

import java.io.*;

public class Exercise {
    public static void main(String[] args) throws Exception {

        // I couldn't change my all video file name in a specific directory. i try to do that, but now isn't possible to do that. it converts as a file type. don't know how to resolve it.

        FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\Table of contents.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line;
        int x = 0;
//
//
//        FileOutputStream fos = new FileOutputStream("C:\\Users\\HP\\Desktop\\Table of contents1.txt");
//        PrintStream ps = new PrintStream(fos);



        File f = new File("E://JavaMaster");

        File list[] = f.listFiles();
//        for(File x:list){
//            System.out.println(x.getName());
//        }
        System.out.println(f.isDirectory());

        while ((line = br.readLine())!= null){
            System.out.println(x+" "+line);
            System.out.println(list[x].renameTo(new File(f.getParent(),line)));
            x++;
        }


    }
}
