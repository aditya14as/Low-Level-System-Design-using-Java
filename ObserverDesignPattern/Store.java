package ObserverDesignPattern;

import ObserverDesignPattern.Observable.IphoneObservableImp;
import ObserverDesignPattern.Observable.MacbookObservableImp;
import ObserverDesignPattern.Observable.StockObservable;
import ObserverDesignPattern.Observer.EmailAlertObserverImp;
import ObserverDesignPattern.Observer.MobileAlertObserverImp;
import ObserverDesignPattern.Observer.NotificationAlertObserver;

// High Level Design Link:- https://photos.app.goo.gl/epH7kMxPMRgvB2ir7
public class Store {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImp();
        StockObservable macbookStockObservable = new MacbookObservableImp();
        NotificationAlertObserver observer1 = new EmailAlertObserverImp("aditya@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImp("734289723874",iphoneStockObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImp("abc@gmail.com",macbookStockObservable);

        iphoneStockObservable.add(observer1);
        macbookStockObservable.add(observer3);
        iphoneStockObservable.add(observer2);

        iphoneStockObservable.setStockCount(10);
    }
}
