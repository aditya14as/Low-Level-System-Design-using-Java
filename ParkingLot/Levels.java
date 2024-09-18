package ParkingLot;

import ParkingLot.Vehicle.Bike;
import ParkingLot.Vehicle.Vehicle;
import ParkingLot.Vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Levels {
    private int floorNumber;
    private List<Spot> parkingSpots;
    public Levels(int floorNumber, int totalSpots) {
        this.floorNumber = floorNumber;
        parkingSpots = new ArrayList<Spot>(totalSpots);
        //Assign spots based on 50:40:10 ratio | Also can be taken from user
        int bikeSpots = totalSpots*5/10;
        for(int i = 1; i <=bikeSpots; i++) {
            parkingSpots.add(new Spot(i, VehicleType.Bike));
        }
        int carSpots = totalSpots*4/10;
        for(int i = bikeSpots+1; i <=bikeSpots+1+carSpots; i++) {
            parkingSpots.add(new Spot(i, VehicleType.Car));
        }
        for(int i = carSpots+bikeSpots+1; i <=totalSpots; i++) {
            parkingSpots.add(new Spot(i, VehicleType.Truck));
        }
    }
    public boolean park(Vehicle vehicle) {
        for(Spot spot : parkingSpots) {
            if(spot.getVehicleType()==vehicle.getType() && !spot.isParked()) {
                spot.setParkedVehicle(vehicle);
                return true;
            }
        }
        return false;
    }
    public boolean unpark(Vehicle vehicle) {
        for(Spot spot : parkingSpots) {
            if(spot.getParkedVehicle()==vehicle && spot.isParked()) {
                spot.unparkVehicle();
                return true;
            }
        }
        return false;
    }
    public void getAvailability() {
        System.out.println("Current Floow: " + floorNumber);
        for(Spot spot : parkingSpots) {
            if(spot.isParked()){
                System.out.println("Parked at spot number "+ spot.getSpotNumber()+" for type " + spot.getVehicleType());
            }else{
                System.out.println("Parking Available at spot number "+ spot.getSpotNumber()+" for type " + spot.getVehicleType());
            }
        }
    }
}
