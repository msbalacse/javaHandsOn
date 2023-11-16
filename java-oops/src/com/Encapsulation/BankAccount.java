package com.Encapsulation;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

// Encapsulation
// properties and behaviour wrapping up into a class
public class BankAccount {
    String name;
    BigDecimal balance;
    boolean hasOverdraft;

    public BankAccount(String name, BigDecimal balance, boolean hasOverdraft) {
        this.name = name;
        this.balance = balance;
        this.hasOverdraft = hasOverdraft;
    }

    public BankAccount(String name) {
        this.name = name;
        this.hasOverdraft = false;
        this.balance = ZERO;
    }

    public BigDecimal withdraw(BigDecimal amount){
        if(balance.subtract(amount).compareTo(ZERO) >= 0){
            this.balance = this.balance.subtract(amount);
            return balance;
        }
        return ZERO;
    }
}
