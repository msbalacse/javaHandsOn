package com.Encapsulation;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

// Encapsulation
// properties and behaviour wrapping up into a class
public class BankAccount {
    String name;
    private BigDecimal balance;
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

    public BigDecimal getBalance() {
        return balance;
    }

    public boolean setBalance(BigDecimal balance) {
        BigDecimal check = new BigDecimal("100");
        if(balance.compareTo(check) < 100){
            System.out.println("it's over the limit, so 100$ dollar only add in account");
            this.balance.add(balance);
            return false;
        }else {
            System.out.println(balance+" amount of balance added in your account");
            this.balance.add(balance);
        }
        return true;
    }

    public BigDecimal withdraw(BigDecimal amount){
        if(balance.subtract(amount).compareTo(ZERO) >= 0){
            this.balance = this.balance.subtract(amount);
            return balance;
        }
        return ZERO;
    }
}
