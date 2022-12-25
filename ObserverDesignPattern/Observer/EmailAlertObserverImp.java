package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class EmailAlertObserverImp implements NotificationAlertObserver{
    String emailId;
    StockObservable observable;

    public EmailAlertObserverImp(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMessageOnEmail(emailId,"Product is back in stock");
    }

    /*public void update1(StockObservable observable){}  This is Optional
    we are Using Has-A relationship with StockObservable because if we don't do it
    then we have to use getInstance of method to find out that which instance does
    observable belong between IphoneObservableImp and MacbookObservableImp to get
    stockCount etc.
    */
    private void sendMessageOnEmail(String emailId, String msg) {
        System.out.println("Notification sent to: "+ emailId);
    }
}
