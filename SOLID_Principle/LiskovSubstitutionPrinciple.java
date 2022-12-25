package SOLID_Principle;
/* L- Stand for Liskov Substitution Principle
If class B is subtype of class A, then we should be able to replace object of
A with B without breaking the behaviour of the program

* Subclass should extend the capability of parent class not narrow it down
* Every child should class should follow all the methods of its parent.
*/
public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {

    }
}

interface Bike{
    void turnOnEngine();
    void accelerate();
}
class Motorcycle implements Bike{
    boolean isEngineOn;
    int speed;
    @Override
    public void turnOnEngine() {
        isEngineOn = true;
    }
    @Override
    public void accelerate() {
        speed = speed + 10;
    }
}

class Bicycle implements Bike{
    int speed;
    //Here we are narrow down the Bike interface because
    //we are downgrading its turnOnEngine Feature
    @Override
    public void turnOnEngine() {
        throw new AssertionError("There is no Engine");
    }
    @Override
    public void accelerate() {
        speed = speed + 10;
    }
}