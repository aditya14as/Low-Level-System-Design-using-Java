package ObserverDesignPattern.WeatherNotification.Observable;

import ObserverDesignPattern.WeatherNotification.Observer.WeatherObserver;


public interface Weather {
    public void notifyWeather(Weather weather);
    public void addObserver(WeatherObserver observer);
    public void removeObserver(WeatherObserver observer);
    public String getObservableName();
    public void setValue(double value,Weather weather);
    public double getValue();
}
