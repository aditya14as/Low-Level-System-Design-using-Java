package ParkingLot;

import ParkingLot.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Levels> levels;
    private static ParkingLot instance;
    private ParkingLot(){
        levels = new ArrayList<Levels>();
    }
    public static ParkingLot getInstance(){
        if(instance == null){
            instance = new ParkingLot();
        }
        return instance;
    }
    public void addLevel(Levels level){
        levels.add(level);
    }
    public void parkVehicle(Vehicle vehicle){
        for(Levels level : levels){
            if(level.park(vehicle)){
                System.out.println("Parked Vehicle");
                return;
            }
        }
        System.out.println("Vehicle Not Parked");
    }
    public void unparkVehicle(Vehicle vehicle){
        for(Levels level : levels){
            if(level.unpark(vehicle)){
                System.out.println("UnParked Vehicle");
                return;
            }
        }
        System.out.println("Vehicle Not UnParked");
    }
    public void displayAvailaibility(){
        for(Levels level : levels){
            level.getAvailability();
        }
    }

}
