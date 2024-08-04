package ObserverDesignPattern;

import ObserverDesignPattern.WeatherNotification.Observable.HumidityObservable;
import ObserverDesignPattern.WeatherNotification.Observable.TemperatureObservable;
import ObserverDesignPattern.WeatherNotification.Observable.Weather;
import ObserverDesignPattern.WeatherNotification.Observer.AndroidObserver;
import ObserverDesignPattern.WeatherNotification.Observer.IphoneWeatherObserver;
import ObserverDesignPattern.WeatherNotification.Observer.WeatherObserver;

public class Devices {
    public static void main(String[] args) {
        WeatherObserver androidObserver = new AndroidObserver("Rahul");
        WeatherObserver iphoneObserver = new IphoneWeatherObserver("Sumit");
        Weather weather = new HumidityObservable("Humidity");
        Weather weather1 = new TemperatureObservable("Temperature");
        weather1.addObserver(androidObserver);
        weather.addObserver(iphoneObserver);
        weather1.setValue(30.0,weather1);
        weather.setValue(40.0,weather);
        weather.setValue(41.0,weather);
        weather1.setValue(30.0,weather1);
    }
}
