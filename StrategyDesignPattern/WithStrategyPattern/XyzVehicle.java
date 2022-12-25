package StrategyDesignPattern.WithStrategyPattern;

import StrategyDesignPattern.WithStrategyPattern.Strategy.XyzDriveStrategy;
/*
XYZVehicle IS-A relationship with Vehicle

Is-A relationship: Whenever one class inherits another class, it is called an IS-A relationship.
It is related to Inheritance.
It is denoted by ---|>
*/

public class XyzVehicle extends Vehicle{
    public XyzVehicle(){
        super(new XyzDriveStrategy());
    }
}
