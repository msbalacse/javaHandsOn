package com.msbala.car;

import com.msbala.classexercise.Brand;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(Brand.BMW, BigDecimal.TEN);

        CarService carService = new CarService();

        carService.registerNewCar(car);
        System.out.println(Arrays.toString(carService.getCars()));
    }
}
