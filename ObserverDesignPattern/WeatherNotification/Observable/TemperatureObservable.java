package ObserverDesignPattern.WeatherNotification.Observable;

import ObserverDesignPattern.WeatherNotification.Observer.WeatherObserver;
import java.util.*;

public class TemperatureObservable implements Weather{
    private String name;
    private double temperature;
    private List<WeatherObserver> observers;
    public TemperatureObservable(String name) {
        this.name = name;
        observers = new ArrayList<>();
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

    @Override
    public void setValue(double value,Weather weather) {
        if (this.temperature != value) {
            notifyWeather(weather);
        }
        this.temperature = value;
    }

    @Override
    public double getValue() {
        return this.temperature;
    }
}
