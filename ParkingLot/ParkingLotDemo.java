package ParkingLot;

import ParkingLot.Vehicle.Bike;
import ParkingLot.Vehicle.Car;
import ParkingLot.Vehicle.Truck;
import ParkingLot.Vehicle.Vehicle;

public class ParkingLotDemo {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();
        Levels level = new Levels(1,10);
        parkingLot.addLevel(level);
        parkingLot.displayAvailaibility();
        Levels level2 = new Levels(2,5);
        parkingLot.addLevel(level2);
        Vehicle vehicle = new Car("ABV123");
        Vehicle vehicle1 = new Bike("WED231");
        Vehicle vehicle2 = new Truck("RTY567");
        parkingLot.parkVehicle(vehicle);
        parkingLot.displayAvailaibility();
        parkingLot.parkVehicle(vehicle1);
        parkingLot.parkVehicle(vehicle2);
        parkingLot.displayAvailaibility();
    }
}
