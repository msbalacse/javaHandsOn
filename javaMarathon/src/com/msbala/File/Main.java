package com.msbala.File;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java 🌟");

        File file =  createFile("D:/JavaFiles/msbala/foo.txt");

        writeToFile(file,false);

        try {
            Scanner in = new Scanner(file);
            while (in.hasNext()){
                System.out.println(in.nextLine());
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

    }

    private static void writeToFile(File file, boolean append){
        try{
            FileWriter fileWriter = new FileWriter(file,append);
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.println("Hello");
            writer.println("msbala");
            writer.println("Test");
            writer.println("Welcome");
            writer.println("Madurai");

            writer.flush();
            writer.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    private static File createFile(String path){
        try{
            File file = new File(path);

            if(!file.exists()){
                file.createNewFile();
            }
            return file;
        }catch (IOException e){
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }
}
