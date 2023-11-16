package com.Booking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("java program 🌟");
        Scanner in = new Scanner(System.in);
        boolean flag = true;

        while (flag){

            System.out.println();
            System.out.println();

            System.out.println("1. Book Car");
            System.out.println("2. View all user booked cars");
            System.out.println("3. View all booking");
            System.out.println("4. View available cars");
            System.out.println("5. View available electric cars");
            System.out.println("6. View all user");
            System.out.println("7. Exit");

            System.out.println();
            System.out.print("Choose a option :  ");
            int opt = in.nextInt();
            System.out.println();
            switch (opt){
                case 1:
                    System.out.println("booked car");
                    break;
                case 2:
                    System.out.println("All user details");
                    break;
                case 3:
                    System.out.println("All car details");
                    break;
                case 4:
                    System.out.println("user exit successfully");
                    flag = false;
                    break;
                default:
                    System.out.println("Enter the correct option");

            }
        }
    }

}