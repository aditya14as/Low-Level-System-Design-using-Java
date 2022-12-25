package StrategyDesignPattern.WithStrategyPattern;
import StrategyDesignPattern.WithStrategyPattern.Strategy.DriveStrategy;
/*
Vehicle Has-A Relationship with DriveStrategy

Has-A relationship: Whenever an instance of one class is used in another class,
it is called HAS-A relationship. It's denoted by --->

*/
public class Vehicle {
    DriveStrategy driveobj;
    public Vehicle(DriveStrategy driveobj){
        this.driveobj = driveobj;
    }
    void drive(){
        driveobj.drive();
    }
}
