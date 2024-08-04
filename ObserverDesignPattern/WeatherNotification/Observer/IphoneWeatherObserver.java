package ObserverDesignPattern.WeatherNotification.Observer;


import ObserverDesignPattern.WeatherNotification.Observable.Weather;

public class IphoneWeatherObserver implements WeatherObserver  {
    private String name;
    public String getName(){
        return name;
    }
    public IphoneWeatherObserver(String name) {
        this.name = name;
    }
    @Override
    public void update(Weather weather) {
        System.out.println(this.name + " iphone's notified for "+ weather.getObservableName());
    }
}
