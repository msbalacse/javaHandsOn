package com.vehicle;

public class Bike implements Vehicle{
    @Override
    public void start(){
        System.out.println("bike has started");
    }

    @Override
    public void stop() {
        System.out.println("bike has stop");
    }

}
