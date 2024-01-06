package com.msbala.abstraction;

public class Main {
    public static void main(String[] args) {
        var mailService = new MainService();
        mailService.sendEmail();
    }
}
