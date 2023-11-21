package com.car;

public class Main {
    public static void main(String[] args) {

        CarDAO carDAO = new CarDAO();
        EmailService emailService = new EmailService();
        MOTService motService = new MOTService(emailService);
        CarService carService = new CarService(carDAO,emailService, motService);

    }
}
