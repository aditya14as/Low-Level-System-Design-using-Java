package ObserverDesignPattern.WeatherNotification.Observer;



import ObserverDesignPattern.WeatherNotification.Observable.Weather;

public class AndroidObserver implements WeatherObserver  {
    private String name;
    public String getName(){
        return name;
    }
    public AndroidObserver(String name){
        this.name = name;
    }
    @Override
    public void update(Weather weather) {
        System.out.println(this.name + " android's notified for "+ weather.getObservableName());
    }
}
