package com.inheritance;

public class Manager extends Employee{
    public Manager(String name, int age, String address, String experience) {
        super(name, age, address, experience);
    }

    public void report(){
        System.out.println("Manager writing");
    }
}
