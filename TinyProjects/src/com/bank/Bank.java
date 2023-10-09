package com.bank;

abstract public class Bank {
abstract void deposit(double amount);
abstract void withdraw(double amount);
abstract double checkBalance();
}

class Savingaccount extends Bank {
    private double currentBalance = 0;
    public void addInterest(double rate){
        System.out.println(rate);
    }

    @Override
    void deposit(double amount) {
        currentBalance+=amount;
        System.out.println("Money has deposited Successfully And now current balance is : " + currentBalance);
    }

    @Override
    void withdraw(double amount) {
        currentBalance-=amount;
        System.out.println("Money has withdraw successfully And now current balance is : " + currentBalance);
    }

    @Override
    double checkBalance() {
        return currentBalance;
    }
}

class CheckingAccount extends Bank {
    public void deductFees(double fee){
        System.out.println(fee);
    }

    @Override
    void deposit(double amount) {

    }

    @Override
    void withdraw(double amount) {

    }

    @Override
    double checkBalance() {
        return 0;
    }
}