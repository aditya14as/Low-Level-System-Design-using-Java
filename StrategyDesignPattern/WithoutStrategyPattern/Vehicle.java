package StrategyDesignPattern.WithoutStrategyPattern;
/*
Here two child class OffRoadVehicle and SportsVehicle having Sports drive capabilites
but here we have to repeat code for both of these two because Base class having
only Normal drive capabilities.

With increase in child of the system Duplicate code will grow
*/
public class Vehicle {
    public void Drive(){
        System.out.println("Normal drive capability");
    }
}
