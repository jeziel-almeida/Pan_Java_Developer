package com.ObserverWeather;

import java.util.ArrayList;
import java.util.List;

public class Weather {
    
    private WeatherType currentWeather;
    private final List<WeatherObserver> observers;

    public Weather() {
        this.observers = new ArrayList<>();
        currentWeather = WeatherType.SUNNY;
    }

    public void addObservers(WeatherObserver obs) {
        observers.add(obs);
    }
    
    public void removeObservers(WeatherObserver obs) {
        observers.remove(obs);
    }


    public void timePasses() {
        var enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        System.out.println("\n🌦 The weather changed to " + currentWeather);
        notifyObservers();
    }

    private void notifyObservers() {
        for(var obs : observers) {
            obs.update(currentWeather);
        }
    }

}
