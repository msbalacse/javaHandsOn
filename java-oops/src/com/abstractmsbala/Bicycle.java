package com.abstractmsbala;

public class Bicycle implements Vehicle{

    public int currentSpeed;

    public Bicycle(){

    }
    public Bicycle(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void move(int amount) {
        this.currentSpeed +=amount;
    }

    @Override
    public void applyBreaks(int amount) {
        this.currentSpeed -= amount;
    }

    @Override
    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
