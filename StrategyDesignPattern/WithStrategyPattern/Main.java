package StrategyDesignPattern.WithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new OffRoadVehicle();
        vehicle.drive();
        Vehicle vehicle1 = new XyzVehicle();
        vehicle1.drive();

        Vehicle vehicle2 = new ElectricVehicle();
        vehicle2.drive();
    }
}
