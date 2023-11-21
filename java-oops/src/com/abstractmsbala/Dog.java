package com.abstractmsbala;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Wif Wif");
    }

    public Dog(String name) {
        super(name);
    }
}

