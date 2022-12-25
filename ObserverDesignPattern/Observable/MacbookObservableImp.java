package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;
/*
It is a concrete class of StockObservable Interface having IS-A relationship with it.
*/
public class MacbookObservableImp implements StockObservable{
    List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stockCount = 0;
    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer: observerList) {
            observer.update();

           /* observer.update1(observer); This is optional,
            we are using Has-A relationship of NotificationAlertObserver to avoid this.*/
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(this.stockCount==0){
            notifySubscribers();
        }
        this.stockCount = this.stockCount + newStockAdded;
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }
}
