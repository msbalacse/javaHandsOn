package com.vehicle;

public class App {
    public static void main(String[] args) {
        System.out.println("----- Main ------");
        Bike bikeobj = new Bike();
        Car carobj = new Car();

        bikeobj.start();
        carobj.start();
    }
}
