package com.inheritance;

public class Main {
    public static void main(String[] args) {
        String[] languages = {"Java","Web","Android"};

        Programmer java = new Programmer("Joshua",21,"Vadakankulam","Java",languages);

        System.out.println(java);
        java.writeSomeCode();
        System.out.println(java.getAddress());
    }
}
