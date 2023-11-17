package com.inheritance;

import java.util.Arrays;

public class Programmer extends Employee{

    private String[] programmingLanguages;

    public Programmer(String name,int age,String address,String experience) {
        super(name,age,address,experience);
    }

    public Programmer(String name, int age, String address, String experience, String[] programmingLanguages) {
        super(name, age, address, experience);
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public String toString() {
        return super.toString() + ", Programmer{" +
                "programmingLanguages=" + Arrays.toString(programmingLanguages) +
                '}';
    }

    public void writeSomeCode(){
        System.out.println("Writing some code");
    }
}
