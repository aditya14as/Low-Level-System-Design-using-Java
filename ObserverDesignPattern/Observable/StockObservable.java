package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationAlertObserver;
/*
Observer pattern is used when there is one-to-many relationship between objects
such as if one object is modified, its dependent objects are to be notified automatically.

Problem:- Implement Notify me feature like Flipkart whenever product back in stock then
it will notify all the subscriber.
*/

/*
It is an observable interface having one to many relationship with NotificationAlertObserver
It Has A relationship with ObserverInterface(i.e NotificationAlertObserver)
*/

public interface StockObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
