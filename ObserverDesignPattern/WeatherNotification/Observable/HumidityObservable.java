package ObserverDesignPattern.WeatherNotification.Observable;


import ObserverDesignPattern.WeatherNotification.Observer.WeatherObserver;
import java.util.*;

public class HumidityObservable implements Weather{
    private String name;
    private double humidity;
    private List<WeatherObserver> observers;
    public HumidityObservable(String name) {
        this.name = name;
        observers = new ArrayList<>();
    }

    public void setValue(double humidity,Weather weather) {
        if(this.humidity != humidity) {
            notifyWeather(weather);
        }
        this.humidity = humidity;
    }
    public double getValue() {
        return humidity;
    }

    @Override
    public void notifyWeather(Weather weather) {
        for (WeatherObserver observer : observers) {
            observer.update(weather);
        }
    }

    @Override
    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public String getObservableName() {
        return this.name;
    }
}