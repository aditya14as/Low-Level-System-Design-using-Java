package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

/*
It is a concrete class of NotificationAlertObserver having Is-A relationship with it.

Note:- It's also having Has-A relationship with StockObservable, although it's optional
but if we don't do it then there's no StockObservable instance here and it will come as
in a argument of update() method and then we have to use instanceOf method to find that
which class does it belongs between IphoneObservableImp and MacbookObservableImp.
This will slow down the process with increase in no of Concrete class of StockObservable.
*/
public class MobileAlertObserverImp implements NotificationAlertObserver {
    String username;
    StockObservable observable;

    public MobileAlertObserverImp(String emailId, StockObservable observable) {
        this.username = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        int data = observable.getStockCount();
        System.out.println("Stock is"+data+" units");
        sendMessageOnMobile(username, "Product is back in stock");
    }

    private void sendMessageOnMobile(String username, String msg) {
        System.out.println("Message sent to: " + username);
    }
}
