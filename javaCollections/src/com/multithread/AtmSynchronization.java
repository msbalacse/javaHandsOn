package com.multithread;

class Atm{

    private double balance;

    public void setBalance(double b){
        balance = b;
    }

    synchronized public void checkBalance(String name){
        System.out.println(name+", Your account balance is : ");
        try{Thread.sleep(1000);}catch (Exception e){
            System.out.println("not working");
        }
        System.out.println(balance);
    }
    synchronized public void withdraw(int amount){
        this.balance-=amount;
        try{Thread.sleep(1000);}catch (Exception e){
            System.out.println("not working");
        }
        System.out.println("Your current balance is :" + balance);
    }
}

class Customer extends Thread{

    Atm atm;
    public String CustomerName;
    public int amount;

    public Customer(String name,double b,int w,Atm a){
        atm = a;
        atm.setBalance(b);
        this.amount = w;
        this.CustomerName = name;
    }

    public void useATM(){
        atm.checkBalance(CustomerName);
        atm.withdraw(amount);
    }
    public void run(){
        useATM();
    }
}
public class AtmSynchronization {
    public static void main(String[] args) {
            Atm atm = new Atm();
            Customer bala = new Customer("bala",1000.00,123,atm);
            Customer joshua = new Customer("joshua",2000.00,73,atm);

            bala.start();
            joshua.start();

    }
}
