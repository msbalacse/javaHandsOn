package com.abstractmsbala;

public class Car implements Vehicle{

    public int currentSpeed;

    public Car(){

    }
    public Car(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
    @Override
    public void move(int amount){
        this.currentSpeed += amount;
    }
    @Override
    public void applyBreaks(int amount){
        this.currentSpeed -= amount;
    }
    @Override
    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
