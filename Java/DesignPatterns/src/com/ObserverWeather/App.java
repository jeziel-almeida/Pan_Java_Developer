package com.ObserverWeather;

public class App {
    public static void main(String[] args) {
        
        var weather = new Weather();
        weather.addObservers(new Hobbits());
        weather.addObservers(new Orcs());

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
    }
}
