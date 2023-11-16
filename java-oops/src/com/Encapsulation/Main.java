package com.Encapsulation;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("msbala", BigDecimal.TEN,false);

        account.balance = new BigDecimal("19289");
        System.out.println(account.withdraw(new BigDecimal("2.0")));
    }
}
