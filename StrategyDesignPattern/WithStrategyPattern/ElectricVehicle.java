package StrategyDesignPattern.WithStrategyPattern;

import StrategyDesignPattern.WithStrategyPattern.Strategy.ElectricDriveStrategy;

public class ElectricVehicle extends Vehicle {
    public ElectricVehicle() {
        super(new ElectricDriveStrategy());
    }

}
