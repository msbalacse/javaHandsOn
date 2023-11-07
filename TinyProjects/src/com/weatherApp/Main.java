package com.weatherApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Weather CLI App");
            System.out.println("1. Fetch Weather Data");
            System.out.println("2. Display Weather Data");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter a city: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter a country: ");
                    String country = scanner.nextLine();
                    Location location = new Location(city, country);
                    weatherData.fetchWeatherData(location);
                    break;
                case 2:
                    System.out.print("Enter a city: ");
                    String displayCity = scanner.nextLine();
                    System.out.print("Enter a country: ");
                    String displayCountry = scanner.nextLine();
                    Location displayLocation = new Location(displayCity, displayCountry);
                    Weather weather = weatherData.getWeatherData(displayLocation);
                    if (weather != null) {
                        System.out.println("Weather data for " + displayLocation + ":");
                        System.out.println(weather);
                    } else {
                        System.out.println("Weather data not available for " + displayLocation);
                    }
                    break;
                case 3:
                    System.out.println("Exiting the Weather CLI App.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
