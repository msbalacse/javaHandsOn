package com.javaioexercise;

import java.io.*;
import java.util.Scanner;

class Customer implements Serializable {
    String cusID;
    String name;
    String phNo;

    static int count = 1;

    Customer(){}

    Customer(String n,String p){
        cusID="C"+count;
        count++;
        name=n;
        phNo=p;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cusID='" + cusID + '\'' +
                ", name='" + name + '\'' +
                ", phNo='" + phNo + '\'' +
                '}';
    }
}
public class StudentChallenge1 {
//    public static void main(String[] args) throws Exception{
//        Customer list[] ={new Customer("Joshua","234234242"),new Customer("Walter","2547434534"),new Customer("Antony","46373454")};
//
//        FileOutputStream fos = new FileOutputStream("D://JavaFiles//Customer.txt");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//        oos.writeObject(list.length);
//        for(Customer c:list){
//            oos.writeObject(c);
//        }
//
//        oos.close();
//        fos.close();
//    }

    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);

        FileInputStream fis = new FileInputStream("D://JavaFiles//Customer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        int length = ois.readInt();

        Customer list[] = new Customer[length];

        for (int i = 0; i < length; i++) {
            list[i] = (Customer) ois.readObject();
        }

        System.out.println("Enter Name of Customer : ");
        String name =  in.next();

        for (int i = 0; i < length; i++) {
            if(name.equalsIgnoreCase(list[i].name)){
                System.out.println(list[i]);
            }

        }

        ois.close();
        fis.close();
    }
}
