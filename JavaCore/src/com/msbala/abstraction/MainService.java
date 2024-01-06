package com.msbala.abstraction;

public class MainService {
    public void  sendEmail(){
        connect();
        authenticate();
        disconnect();
    }

    public void  connect(){
        System.out.println("Connect");
    }

    public void  disconnect(){
        System.out.println("disconnect");
    }

    public void authenticate(){
        System.out.println("Authenticate");
    }
}
