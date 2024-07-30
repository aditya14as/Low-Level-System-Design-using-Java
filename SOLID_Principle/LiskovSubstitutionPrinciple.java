package SOLID_Principle;
/* L- Stand for Liskov Substitution Principle
If class B is subtype of class A, then we should be able to replace object of
A with B without breaking the behaviour of the program

* Subclass should extend the capability of parent class not narrow it down
* Every child should class should follow all the methods of its parent.
*/
public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        Bird sparrow = new Bird();
        Bird ostrich = new Ostrich();

        sparrow.fly(); // This works fine
        ostrich.fly(); // This will throw an exception and is breaking Liskov Substitution Principle as well


        Bird2 sparrow2 = new Sparrow2();
        Bird2 ostrich2 = new Ostrich2();

        sparrow2.move(); // This works fine, bird is flying
        ostrich2.move(); // This works fine, bird is walking
    }
}

//Without Liskov Substitution Principle
class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly");
    }
}
class Sparrow extends Bird {
    // Sparrow can fly
}

//With Liskov Substitution Principle
abstract class Bird2 {
    public abstract void move();
}

class FlyingBird extends Bird2 {
    @Override
    public void move() {
        fly();
    }

    public void fly() {
        System.out.println("Bird is flying");
    }
}

class NonFlyingBird extends Bird2 {
    @Override
    public void move() {
        walk();
    }

    public void walk() {
        System.out.println("Bird is walking");
    }
}

class Sparrow2 extends FlyingBird {
    // Sparrow can fly
}

class Ostrich2 extends NonFlyingBird {
    // Ostrich can't fly, it can walk
}