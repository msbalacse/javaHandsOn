package com.msbala;

import java.util.Scanner;

public class Main {

    public static final String BRAND = "msBala";

    private static double calculatePropertyYield(double rent,double propertyPrice){
        double yearlyRent = rent * 12;
        return (yearlyRent/propertyPrice)*100;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String BRAND = "Joshua";


        Main main = new Main();

        System.out.println(main.BRAND.substring(2));

        System.out.println("Hello Java ✨");
        System.out.println(Main.BRAND);



//        double yield  = calculatePropertyYield(1_300,250_000);
//        System.out.println(yield);


//        System.out.println(22+18);
//
//        String example = "W1o2r3d";
//
//        char[] covertChar = example.toCharArray();
//
//        System.out.println(Arrays.toString(covertChar));
//
//        for(char c:covertChar){
//            System.out.println(c);
//        }
//
//        System.out.println();
//        System.out.println();
//        System.out.println();

        /*
        int i =0;
        while(i < 51){
            System.out.println(i++);
        }
         */

//        boolean flag = true;
//        while (flag){
//            String name = in.next();
//            switch (name) {
//                case "joshua" -> System.out.println("Pass");
//                case "bala" -> System.out.println("Need more mark");
//                default -> System.out.println("try different name");
//            }
//            System.out.println("if you want exit enter the e :");
//            flag = !in.next().equals("e");
//        }

    }
}