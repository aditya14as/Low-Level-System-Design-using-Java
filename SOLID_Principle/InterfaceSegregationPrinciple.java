package SOLID_Principle;
/*
I- Interface Segregation Principle
Interface should be such that client should not
implement unnecessary functions they do not need.
* */
public class InterfaceSegregationPrinciple {
    public static void main(String[] args) {

    }
}

interface RestaurantEmployee{
    void washDishes();
    void serveCustomers();
    void cookFood();
}
class Waiter implements RestaurantEmployee{
    @Override
    // Here are we still implementing this method
    //that we don't need
    public void washDishes() {

    }

    @Override
    public void cookFood() {

    }

    @Override
    public void serveCustomers() {

    }
}


/*
Interface should be segmented in small parts such tha
any class should not implement unnecessary function
*/

interface WaiterInterface{
    void serveFood();
    void takeOrder();
}

interface ChefInterface{
    void cookFood();
    void decideMenu();
}

class NewWaiter implements WaiterInterface{
    @Override
    public void takeOrder() {

    }

    @Override
    public void serveFood() {

    }
}