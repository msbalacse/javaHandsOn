package com.abstractmsbala;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }

    public Cat(String name) {
        super(name);
    }

}

