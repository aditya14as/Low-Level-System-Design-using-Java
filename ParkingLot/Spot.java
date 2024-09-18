package ParkingLot;

import ParkingLot.Vehicle.Vehicle;
import ParkingLot.Vehicle.VehicleType;

public class Spot {
    private int spotNumber;
    private VehicleType vehicleType;
    private Vehicle parkedVehicle;
    Spot(int spotNumber, VehicleType vehicleType) {
        this.spotNumber = spotNumber;
        this.vehicleType = vehicleType;
    }
    public boolean isParked(){
        return parkedVehicle != null;
    }
    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }
    public void setParkedVehicle(Vehicle vehicle) {
        if (vehicle.getType() == vehicleType) {
            this.parkedVehicle = vehicle;
        }else {
            throw new IllegalArgumentException("Spot " + spotNumber + " is not of type " + vehicleType);
        }
    }
    public void unparkVehicle(){
        parkedVehicle = null;
    }

    public int getSpotNumber() {
        return spotNumber;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
