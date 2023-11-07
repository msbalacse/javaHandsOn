package com.weatherApp;

import java.util.*;

public class WeatherData {
    private Map<Location, Weather> data;

    public WeatherData() {
        data = new HashMap<>();
    }

    public void fetchWeatherData(Location location) {
        double temperature = Math.random() * 30 + 10;
        double humidity = Math.random() * 60 + 40;
        double windSpeed = Math.random() * 15;

        Weather weather = new Weather(temperature, humidity, windSpeed);
        data.put(location, weather);
        System.out.println("Weather data fetched and stored for " + location);
    }

    public Weather getWeatherData(Location location) {
        return data.get(location);
    }
}
