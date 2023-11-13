package com.msbala.classexercise;

import com.msbala.car.Car;

import java.math.BigDecimal;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("java ✨ believe me you can do it ");

        Address joshuaAddress = new Address("West Street madurai","TN 625022","India");

        Car tesla = new Car(Brand.BMW,new BigDecimal("62500000"));

        Car[] joshuaCars = {tesla};

        Person joshua = new Person("Joshua",21,joshuaAddress, joshuaCars);

        Date today = new Date();

        Student john = new Student("John",101,"Math",today);

        System.out.println(john);

        System.out.println(joshua);


    }
}
