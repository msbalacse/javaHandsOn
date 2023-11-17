package com.Encapsulation;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("msbala", BigDecimal.TEN,false);


        System.out.println(account.withdraw(new BigDecimal("2.0")));
        System.out.println(account.withdraw(new BigDecimal("2.0")));
        System.out.println(account.withdraw(new BigDecimal("2.0")));
        System.out.println(account.getBalance());
        System.out.println(account.setBalance(new BigDecimal("50")));
        System.out.println(account.getBalance());
        System.out.println(account.setBalance(new BigDecimal("50")));
        System.out.println(account.getBalance());

    }
}
