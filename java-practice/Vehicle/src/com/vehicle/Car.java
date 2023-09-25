package com.vehicle;

public class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("car has started");
    }

    @Override
    public void stop(){
        System.out.println("Car has stop");
    }
}
