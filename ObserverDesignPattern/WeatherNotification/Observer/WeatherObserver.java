package ObserverDesignPattern.WeatherNotification.Observer;

import ObserverDesignPattern.WeatherNotification.Observable.Weather;

public interface WeatherObserver {
    public void update(Weather weather);
}
