package com.bank;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Main App");
        Scanner in = new Scanner(System.in);

        Savingaccount sa = new Savingaccount();

        double withdrawAmount = in.nextDouble();

        System.out.println(sa.checkBalance());
        sa.deposit(1000);
        System.out.println(sa.checkBalance());
        sa.withdraw(withdrawAmount);
        System.out.println(sa.checkBalance());

    }
}
