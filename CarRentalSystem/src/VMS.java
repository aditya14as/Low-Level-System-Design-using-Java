import java.util.*;

//TODO make it singleton
public class VMS {
    List<Vehicle> vehicles;

    VMS() {
        vehicles = new ArrayList<>();
        generateVehicle();
    }

    public Vehicle getAvailableVehicle() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.status == Status.AVAILABLE) {
                return vehicle;
            }
        }
        return null;
    }

    public boolean bookVehicle(Vehicle vehicle) {
        if (vehicle.status == Status.AVAILABLE) {
            vehicle.status = Status.BOOKED;
            return true;
        }
        return false;
    }

    public boolean setAvailable(Vehicle vehicle) {
        if (vehicle.status != Status.AVAILABLE) {
            vehicle.status = Status.AVAILABLE;
            return true;
        }
        return false;
    }

    public void generateVehicle() {
        Vehicle v1 = new Car("B1087");
        Vehicle v2 = new Car("B1088");
        Vehicle v3 = new Car("B1089");
        Vehicle v4 = new Car("B1090");
        vehicles.add(v1);
        vehicles.add(v2);
        vehicles.add(v3);
        vehicles.add(v4);
    }
}
